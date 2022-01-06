package de.hybris.NagAcc.facades.populators;


import de.hybris.NagAcc.core.model.SellerModel;
import de.hybris.NagAcc.facades.product.data.SellerData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class DefaultSellerPopulator implements Populator<SellerModel , SellerData> {


    @Override
    public void populate(SellerModel sellerModel, SellerData sellerData) throws ConversionException {
        sellerData.setSellerName(sellerModel.getSellerName());
        sellerData.setLeadTime(sellerModel.getLeadTime());
    }
}
