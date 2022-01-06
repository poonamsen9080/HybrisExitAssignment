package de.hybris.NagAcc.core.dao.impl;

import de.hybris.NagAcc.core.dao.CustomGetOrdersFromDAO;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class CustomGetOrdersFromDAOImpl implements CustomGetOrdersFromDAO {

    private FlexibleSearchService flexibleSearchService;

    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }

    @Override
    public List<OrderModel> getOrdersFromDAO() {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        String currentDate = formatter.format(date);

        final StringBuilder query = new StringBuilder("SELECT {PK} FROM {ORDER AS O} WHERE {O.DISPATCHEDDATE} = '"+currentDate+"'");

        final FlexibleSearchQuery searchQuery = new FlexibleSearchQuery(query.toString());
        searchQuery.setResultClassList(Collections.singletonList(OrderModel.class));
        final SearchResult searchResult = getFlexibleSearchService().search(searchQuery);
        List<OrderModel> orderModelList = searchResult.getResult();

        for (OrderModel orderModel : orderModelList) {
            System.out.println(orderModel.getPk());
        }

        return orderModelList;
    }
}
