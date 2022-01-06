package de.hybris.NagAcc.core.service;

import de.hybris.NagAcc.core.dao.impl.SellerDataDaoImpl;
import de.hybris.NagAcc.core.model.SellerModel;

import java.util.List;

public class SellerDataService {

	private SellerDataDaoImpl sellerDataDaoImpl;
	public SellerDataDaoImpl getSellerDataDaoImpl() {
		return sellerDataDaoImpl;
	}

	public void setSellerDataDaoImpl(SellerDataDaoImpl sellerDataDaoImpl) {
		this.sellerDataDaoImpl = sellerDataDaoImpl;
	}

	public List<SellerModel> getSellerDataByService(){

		return getSellerDataDaoImpl().getSellerData();
	}
}