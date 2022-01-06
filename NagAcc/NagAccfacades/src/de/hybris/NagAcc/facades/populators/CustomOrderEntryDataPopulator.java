package de.hybris.NagAcc.facades.populators;

import de.hybris.NagAcc.core.model.SellerModel;
import de.hybris.platform.commercefacades.order.converters.populator.OrderEntryPopulator;
import de.hybris.platform.commercefacades.order.data.OrderEntryData;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.ArrayList;
import java.util.List;

public class CustomOrderEntryDataPopulator extends OrderEntryPopulator {

    private ModelService modelService;
    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    @Override
    public void populate(AbstractOrderEntryModel source, OrderEntryData target) {
        super.populate(source, target);
        List<SellerModel> sellerModelList = (List<SellerModel>) source.getProduct().getSellers();
        List<ProductModel> productModelList = new ArrayList<>();
        if (productModelList.isEmpty()) {

            if (!sellerModelList.isEmpty() && sellerModelList.get(0).getSellerName() != null) {
                target.setSellerName(sellerModelList.get(0).getSellerName());
            }
            productModelList.add(source.getProduct());
        } else {
            for (ProductModel pm : productModelList) {

                if (!source.getProduct().equals(pm)) {
                    if (!sellerModelList.isEmpty() && sellerModelList.get(0).getSellerName() != null) {
                        target.setSellerName(sellerModelList.get(0).getSellerName());
                    }
                    productModelList.add(source.getProduct());
                }
            }
        }

        for (SellerModel sellerModel : sellerModelList){
            source.setSellers(sellerModel);
            getModelService().save(source);
        }
    }
}