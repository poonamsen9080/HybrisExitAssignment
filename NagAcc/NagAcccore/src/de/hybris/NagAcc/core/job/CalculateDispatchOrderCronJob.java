package de.hybris.NagAcc.core.job;

import de.hybris.NagAcc.core.model.CalculateDispatchOrderCronJobModel;
import de.hybris.NagAcc.core.service.CustomGetOrdersService;
import de.hybris.platform.cms2.model.site.CMSSiteModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.List;

public class CalculateDispatchOrderCronJob extends AbstractJobPerformable<CalculateDispatchOrderCronJobModel> {

    private CustomGetOrdersService customGetOrdersService;
    private ModelService modelService;
    private CMSSiteModel cmsSiteModel;

    public CMSSiteModel getCmsSiteModel() {
        return cmsSiteModel;
    }

    public void setCmsSiteModel(CMSSiteModel cmsSiteModel) {
        this.cmsSiteModel = cmsSiteModel;
    }

    public CustomGetOrdersService getCustomGetOrdersService() {
        return customGetOrdersService;
    }

    public void setCustomGetOrdersService(CustomGetOrdersService customGetOrdersService) {
        this.customGetOrdersService = customGetOrdersService;
    }

    public ModelService getModelService() {
        return modelService;
    }

    @Override
    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }


    @Override
    public PerformResult perform(CalculateDispatchOrderCronJobModel calculateDispatchOrderCronJobModel) {

        List<OrderModel> orderModelList = getCustomGetOrdersService().getOrdersFromService();

        if (!orderModelList.isEmpty()) {
              getCmsSiteModel().setTodaysDispatchOrders(orderModelList.size());
              getModelService().save(getCmsSiteModel());
              getModelService().refresh(getCmsSiteModel());
              System.out.println(getCmsSiteModel().getTodaysDispatchOrders());
        }
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }
}
