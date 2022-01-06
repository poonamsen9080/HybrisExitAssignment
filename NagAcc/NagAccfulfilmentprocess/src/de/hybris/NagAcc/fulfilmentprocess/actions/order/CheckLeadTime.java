package de.hybris.NagAcc.fulfilmentprocess.actions.order;

import de.hybris.NagAcc.core.model.SellerModel;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.orderprocessing.model.OrderProcessModel;
import de.hybris.platform.processengine.action.AbstractProceduralAction;
import de.hybris.platform.task.RetryLaterException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CheckLeadTime extends AbstractProceduralAction<OrderProcessModel> {
    @Override
    public void executeAction(OrderProcessModel orderProcessModel) throws RetryLaterException, Exception {
        List<AbstractOrderEntryModel> entryModelList = orderProcessModel.getOrder().getEntries();
        OrderModel orderModel = orderProcessModel.getOrder();
        List<SellerModel> sellerModelList = new ArrayList<>();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        int maxLeadTime = 0;
        String date = "";

        Calendar cal = Calendar.getInstance();


        cal.add(Calendar.DAY_OF_MONTH, +1);

        for (AbstractOrderEntryModel am : entryModelList) {
            if (am.getSellers() != null) {
                sellerModelList.add(am.getSellers());
            } else {
                cal.add(Calendar.DAY_OF_MONTH, +1);
                date = formatter.format(cal.getTime());
                orderModel.setDispatchedDate(date);
            }
        }

        if (!sellerModelList.isEmpty()) {
            for (SellerModel sellerModel : sellerModelList) {
                maxLeadTime = sellerModel.getLeadTime() > maxLeadTime ? sellerModel.getLeadTime() : maxLeadTime;
            }
            cal.add(Calendar.DAY_OF_MONTH, +maxLeadTime);
            date = formatter.format(cal.getTime());
            orderModel.setDispatchedDate(date);
        }
        getModelService().save(orderModel);
        getModelService().refresh(orderModel);
    }
}
