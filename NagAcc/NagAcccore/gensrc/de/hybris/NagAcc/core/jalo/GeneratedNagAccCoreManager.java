/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 06-Jan-2022, 2:00:29 PM                     ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.NagAcc.core.jalo;

import de.hybris.NagAcc.core.constants.NagAccCoreConstants;
import de.hybris.NagAcc.core.jalo.ApparelProduct;
import de.hybris.NagAcc.core.jalo.ApparelSizeVariantProduct;
import de.hybris.NagAcc.core.jalo.ApparelStyleVariantProduct;
import de.hybris.NagAcc.core.jalo.CalculateDispatchOrderCronJob;
import de.hybris.NagAcc.core.jalo.ElectronicsColorVariantProduct;
import de.hybris.NagAcc.core.jalo.Seller;
import de.hybris.NagAcc.core.jalo.SellerCarouselComponent;
import de.hybris.platform.basecommerce.jalo.site.BaseSite;
import de.hybris.platform.cms2.jalo.site.CMSSite;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.order.AbstractOrder;
import de.hybris.platform.jalo.order.AbstractOrderEntry;
import de.hybris.platform.jalo.order.Order;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type <code>NagAccCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedNagAccCoreManager extends Extension
{
	/** Relation ordering override parameter constants for SellerProductRelation from ((NagAcccore))*/
	protected static String SELLERPRODUCTRELATION_SRC_ORDERED = "relation.SellerProductRelation.source.ordered";
	protected static String SELLERPRODUCTRELATION_TGT_ORDERED = "relation.SellerProductRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for SellerProductRelation from ((NagAcccore))*/
	protected static String SELLERPRODUCTRELATION_MARKMODIFIED = "relation.SellerProductRelation.markmodified";
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("sellers", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.AbstractOrderEntry", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("todaysDispatchOrders", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.cms2.jalo.site.CMSSite", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("dispatchedDate", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.Order", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NagAccCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NagAccCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NagAccCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public CalculateDispatchOrderCronJob createCalculateDispatchOrderCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NagAccCoreConstants.TC.CALCULATEDISPATCHORDERCRONJOB );
			return (CalculateDispatchOrderCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CalculateDispatchOrderCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public CalculateDispatchOrderCronJob createCalculateDispatchOrderCronJob(final Map attributeValues)
	{
		return createCalculateDispatchOrderCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NagAccCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public Seller createSeller(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NagAccCoreConstants.TC.SELLER );
			return (Seller)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Seller : "+e.getMessage(), 0 );
		}
	}
	
	public Seller createSeller(final Map attributeValues)
	{
		return createSeller( getSession().getSessionContext(), attributeValues );
	}
	
	public SellerCarouselComponent createSellerCarouselComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NagAccCoreConstants.TC.SELLERCAROUSELCOMPONENT );
			return (SellerCarouselComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SellerCarouselComponent : "+e.getMessage(), 0 );
		}
	}
	
	public SellerCarouselComponent createSellerCarouselComponent(final Map attributeValues)
	{
		return createSellerCarouselComponent( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.dispatchedDate</code> attribute.
	 * @return the dispatchedDate - DispatchedDate Attribute
	 */
	public String getDispatchedDate(final SessionContext ctx, final Order item)
	{
		return (String)item.getProperty( ctx, NagAccCoreConstants.Attributes.Order.DISPATCHEDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Order.dispatchedDate</code> attribute.
	 * @return the dispatchedDate - DispatchedDate Attribute
	 */
	public String getDispatchedDate(final Order item)
	{
		return getDispatchedDate( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.dispatchedDate</code> attribute. 
	 * @param value the dispatchedDate - DispatchedDate Attribute
	 */
	public void setDispatchedDate(final SessionContext ctx, final Order item, final String value)
	{
		item.setProperty(ctx, NagAccCoreConstants.Attributes.Order.DISPATCHEDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Order.dispatchedDate</code> attribute. 
	 * @param value the dispatchedDate - DispatchedDate Attribute
	 */
	public void setDispatchedDate(final Order item, final String value)
	{
		setDispatchedDate( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return NagAccCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.sellers</code> attribute.
	 * @return the sellers - Seller Attribute
	 */
	public Seller getSellers(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (Seller)item.getProperty( ctx, NagAccCoreConstants.Attributes.AbstractOrderEntry.SELLERS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.sellers</code> attribute.
	 * @return the sellers - Seller Attribute
	 */
	public Seller getSellers(final AbstractOrderEntry item)
	{
		return getSellers( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.sellers</code> attribute. 
	 * @param value the sellers - Seller Attribute
	 */
	public void setSellers(final SessionContext ctx, final AbstractOrderEntry item, final Seller value)
	{
		item.setProperty(ctx, NagAccCoreConstants.Attributes.AbstractOrderEntry.SELLERS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.sellers</code> attribute. 
	 * @param value the sellers - Seller Attribute
	 */
	public void setSellers(final AbstractOrderEntry item, final Seller value)
	{
		setSellers( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.sellers</code> attribute.
	 * @return the sellers - Sellers
	 */
	public Collection<Seller> getSellers(final SessionContext ctx, final Product item)
	{
		final List<Seller> items = item.getLinkedItems( 
			ctx,
			true,
			NagAccCoreConstants.Relations.SELLERPRODUCTRELATION,
			"Seller",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.sellers</code> attribute.
	 * @return the sellers - Sellers
	 */
	public Collection<Seller> getSellers(final Product item)
	{
		return getSellers( getSession().getSessionContext(), item );
	}
	
	public long getSellersCount(final SessionContext ctx, final Product item)
	{
		return item.getLinkedItemsCount(
			ctx,
			true,
			NagAccCoreConstants.Relations.SELLERPRODUCTRELATION,
			"Seller",
			null
		);
	}
	
	public long getSellersCount(final Product item)
	{
		return getSellersCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.sellers</code> attribute. 
	 * @param value the sellers - Sellers
	 */
	public void setSellers(final SessionContext ctx, final Product item, final Collection<Seller> value)
	{
		item.setLinkedItems( 
			ctx,
			true,
			NagAccCoreConstants.Relations.SELLERPRODUCTRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SELLERPRODUCTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.sellers</code> attribute. 
	 * @param value the sellers - Sellers
	 */
	public void setSellers(final Product item, final Collection<Seller> value)
	{
		setSellers( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sellers. 
	 * @param value the item to add to sellers - Sellers
	 */
	public void addToSellers(final SessionContext ctx, final Product item, final Seller value)
	{
		item.addLinkedItems( 
			ctx,
			true,
			NagAccCoreConstants.Relations.SELLERPRODUCTRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SELLERPRODUCTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sellers. 
	 * @param value the item to add to sellers - Sellers
	 */
	public void addToSellers(final Product item, final Seller value)
	{
		addToSellers( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sellers. 
	 * @param value the item to remove from sellers - Sellers
	 */
	public void removeFromSellers(final SessionContext ctx, final Product item, final Seller value)
	{
		item.removeLinkedItems( 
			ctx,
			true,
			NagAccCoreConstants.Relations.SELLERPRODUCTRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SELLERPRODUCTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sellers. 
	 * @param value the item to remove from sellers - Sellers
	 */
	public void removeFromSellers(final Product item, final Seller value)
	{
		removeFromSellers( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.todaysDispatchOrders</code> attribute.
	 * @return the todaysDispatchOrders - Todays Dispatch Orders Attribute
	 */
	public Integer getTodaysDispatchOrders(final SessionContext ctx, final CMSSite item)
	{
		return (Integer)item.getProperty( ctx, NagAccCoreConstants.Attributes.CMSSite.TODAYSDISPATCHORDERS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.todaysDispatchOrders</code> attribute.
	 * @return the todaysDispatchOrders - Todays Dispatch Orders Attribute
	 */
	public Integer getTodaysDispatchOrders(final CMSSite item)
	{
		return getTodaysDispatchOrders( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.todaysDispatchOrders</code> attribute. 
	 * @return the todaysDispatchOrders - Todays Dispatch Orders Attribute
	 */
	public int getTodaysDispatchOrdersAsPrimitive(final SessionContext ctx, final CMSSite item)
	{
		Integer value = getTodaysDispatchOrders( ctx,item );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.todaysDispatchOrders</code> attribute. 
	 * @return the todaysDispatchOrders - Todays Dispatch Orders Attribute
	 */
	public int getTodaysDispatchOrdersAsPrimitive(final CMSSite item)
	{
		return getTodaysDispatchOrdersAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CMSSite.todaysDispatchOrders</code> attribute. 
	 * @param value the todaysDispatchOrders - Todays Dispatch Orders Attribute
	 */
	public void setTodaysDispatchOrders(final SessionContext ctx, final CMSSite item, final Integer value)
	{
		item.setProperty(ctx, NagAccCoreConstants.Attributes.CMSSite.TODAYSDISPATCHORDERS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CMSSite.todaysDispatchOrders</code> attribute. 
	 * @param value the todaysDispatchOrders - Todays Dispatch Orders Attribute
	 */
	public void setTodaysDispatchOrders(final CMSSite item, final Integer value)
	{
		setTodaysDispatchOrders( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CMSSite.todaysDispatchOrders</code> attribute. 
	 * @param value the todaysDispatchOrders - Todays Dispatch Orders Attribute
	 */
	public void setTodaysDispatchOrders(final SessionContext ctx, final CMSSite item, final int value)
	{
		setTodaysDispatchOrders( ctx, item, Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CMSSite.todaysDispatchOrders</code> attribute. 
	 * @param value the todaysDispatchOrders - Todays Dispatch Orders Attribute
	 */
	public void setTodaysDispatchOrders(final CMSSite item, final int value)
	{
		setTodaysDispatchOrders( getSession().getSessionContext(), item, value );
	}
	
}
