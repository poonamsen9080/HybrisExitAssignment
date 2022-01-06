package de.hybris.NagAcc.core.dao.impl;

import de.hybris.NagAcc.core.dao.SellerDataDao;
import de.hybris.NagAcc.core.model.SellerModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.Collections;
import java.util.List;

public class SellerDataDaoImpl implements SellerDataDao {

	private FlexibleSearchService flexibleSearchService;
	@Override
	public List<SellerModel> getSellerData() {
		final StringBuilder query = new StringBuilder("SELECT {PK} FROM {SELLER}");
		final FlexibleSearchQuery searchQuery = new FlexibleSearchQuery(query.toString());
		searchQuery.setResultClassList(Collections.singletonList(SellerModel.class));
		final SearchResult searchResult = getFlexibleSearchService().search(searchQuery);
		List<SellerModel> list = searchResult.getResult();
		for (SellerModel sm : list) {
			System.out.println(sm.getPk());
		}
		
		return list;
	}

	public FlexibleSearchService getFlexibleSearchService() {
		return flexibleSearchService;
	}

	public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
		this.flexibleSearchService = flexibleSearchService;
	}
}

