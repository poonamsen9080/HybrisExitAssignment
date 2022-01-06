package de.hybris.NagAcc.core.search.solrfacetsearch.provider.impl;

import de.hybris.NagAcc.core.model.SellerModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.indexer.IndexerBatchContext;
import de.hybris.platform.solrfacetsearch.indexer.spi.InputDocument;
import de.hybris.platform.solrfacetsearch.provider.impl.ModelAttributesValueResolver;

import java.util.ArrayList;
import java.util.List;

public class SellerDataValueResolver extends ModelAttributesValueResolver<ProductModel> {

    @Override
    protected void addFieldValues(InputDocument document, IndexerBatchContext batchContext, IndexedProperty indexedProperty, ProductModel model, ValueResolverContext<Object, Object> resolverContext) throws FieldValueProviderException {

        List<SellerModel> sellerModelList = (List<SellerModel>) model.getSellers();
        List<String> sellerNameList = new ArrayList<>();

        for (SellerModel sm : sellerModelList) {
            sellerNameList.add(sm.getSellerName());
        }

        document.addField(indexedProperty, sellerNameList, resolverContext.getFieldQualifier());
    }
}
