package de.hybris.NagAcc.facades.customfacades;

import de.hybris.NagAcc.core.model.SellerModel;
import de.hybris.NagAcc.core.service.SellerDataService;

import java.util.List;

public class SellerDataFacade {

	private SellerDataService sellerDataService;
	public SellerDataService getSellerDataService() {
		return sellerDataService;
	}

	public void setSellerDataService(SellerDataService sellerDataService) {
		this.sellerDataService = sellerDataService;
	}

	public List<SellerModel> getSellerDataByFacade(){
		return getSellerDataService().getSellerDataByService();
	}
}