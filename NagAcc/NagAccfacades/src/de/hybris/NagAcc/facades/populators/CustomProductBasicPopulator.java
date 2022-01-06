package de.hybris.NagAcc.facades.populators;

import de.hybris.NagAcc.core.model.SellerModel;
import de.hybris.NagAcc.facades.product.data.SellerData;
import de.hybris.platform.commercefacades.product.converters.populator.ProductBasicPopulator;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.ArrayList;
import java.util.List;

public class CustomProductBasicPopulator extends ProductBasicPopulator {

    private Converter<SellerModel, SellerData> sellerConvertor;

    public Converter<SellerModel, SellerData> getSellerConvertor() {
        return sellerConvertor;
    }

    public void setSellerConvertor(Converter<SellerModel, SellerData> sellerConvertor) {
        this.sellerConvertor = sellerConvertor;
    }

    @Override
    public void populate(ProductModel productModel, ProductData productData) throws ConversionException {
        super.populate(productModel, productData);

        final List<SellerData> sellerDataList = new ArrayList<>();

        productModel.getCode();
        productModel.getCatalogVersion();

        for (final SellerModel sellerModel : productModel.getSellers()){
            sellerDataList.add(getSellerConvertor().convert(sellerModel));
        }
        productData.setSellers(sellerDataList);
    }
}
