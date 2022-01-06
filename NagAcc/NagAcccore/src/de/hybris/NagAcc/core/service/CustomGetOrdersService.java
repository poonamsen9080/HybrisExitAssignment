package de.hybris.NagAcc.core.service;

import de.hybris.NagAcc.core.dao.impl.CustomGetOrdersFromDAOImpl;
import de.hybris.platform.core.model.order.OrderModel;

import java.util.List;

public class CustomGetOrdersService {

   private CustomGetOrdersFromDAOImpl customGetOrdersFromDAO;

   public CustomGetOrdersFromDAOImpl getCustomGetOrdersFromDAO() {
      return customGetOrdersFromDAO;
   }

   public void setCustomGetOrdersFromDAO(CustomGetOrdersFromDAOImpl customGetOrdersFromDAO) {
      this.customGetOrdersFromDAO = customGetOrdersFromDAO;
   }

   public List<OrderModel> getOrdersFromService(){
      return getCustomGetOrdersFromDAO().getOrdersFromDAO();
   }
}
