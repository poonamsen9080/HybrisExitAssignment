package de.hybris.NagAcc.storefront.controllers.cms;

import de.hybris.NagAcc.core.model.SellerCarouselComponentModel;
import de.hybris.NagAcc.core.model.SellerModel;
import de.hybris.NagAcc.facades.customfacades.SellerDataFacade;
import de.hybris.NagAcc.storefront.controllers.ControllerConstants;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller("SellerCarouselComponentController")
@Scope("tenant")
@RequestMapping(value = ControllerConstants.Actions.Cms.SellerCarouselComponent)
public class SellerCarouselComponentController extends AbstractAcceleratorCMSComponentController<SellerCarouselComponentModel> {

	@Resource(name = "sellerDataFacade")
	private SellerDataFacade sellerDataFacade;
	public SellerDataFacade getSellerDataFacade() {
		return sellerDataFacade;
	}

	public void setSellerDataFacade(SellerDataFacade sellerDataFacade) {
		this.sellerDataFacade = sellerDataFacade;
	}

	@Override
	protected void fillModel(HttpServletRequest request, Model model, SellerCarouselComponentModel component) {

		final List<SellerModel> sellerDataList = getSellerDataFacade().getSellerDataByFacade();
		model.addAttribute("banner", sellerDataList);
	}
}