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
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Seller}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedSeller extends GenericItem
{
	/** Qualifier of the <code>Seller.sellerName</code> attribute **/
	public static final String SELLERNAME = "sellerName";
	/** Qualifier of the <code>Seller.leadTime</code> attribute **/
	public static final String LEADTIME = "leadTime";
	/** Qualifier of the <code>Seller.sellerBanner</code> attribute **/
	public static final String SELLERBANNER = "sellerBanner";
	/** Qualifier of the <code>Seller.products</code> attribute **/
	public static final String PRODUCTS = "products";
	/** Relation ordering override parameter constants for SellerProductRelation from ((NagAcccore))*/
	protected static String SELLERPRODUCTRELATION_SRC_ORDERED = "relation.SellerProductRelation.source.ordered";
	protected static String SELLERPRODUCTRELATION_TGT_ORDERED = "relation.SellerProductRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for SellerProductRelation from ((NagAcccore))*/
	protected static String SELLERPRODUCTRELATION_MARKMODIFIED = "relation.SellerProductRelation.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SELLERNAME, AttributeMode.INITIAL);
		tmp.put(LEADTIME, AttributeMode.INITIAL);
		tmp.put(SELLERBANNER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * @deprecated since 2011, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Product");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(SELLERPRODUCTRELATION_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Seller.leadTime</code> attribute.
	 * @return the leadTime - Lead Time Attribute(number of days dealer generally takes to dispatch products)
	 */
	public Integer getLeadTime(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, LEADTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Seller.leadTime</code> attribute.
	 * @return the leadTime - Lead Time Attribute(number of days dealer generally takes to dispatch products)
	 */
	public Integer getLeadTime()
	{
		return getLeadTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Seller.leadTime</code> attribute. 
	 * @return the leadTime - Lead Time Attribute(number of days dealer generally takes to dispatch products)
	 */
	public int getLeadTimeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getLeadTime( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Seller.leadTime</code> attribute. 
	 * @return the leadTime - Lead Time Attribute(number of days dealer generally takes to dispatch products)
	 */
	public int getLeadTimeAsPrimitive()
	{
		return getLeadTimeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Seller.leadTime</code> attribute. 
	 * @param value the leadTime - Lead Time Attribute(number of days dealer generally takes to dispatch products)
	 */
	public void setLeadTime(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, LEADTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Seller.leadTime</code> attribute. 
	 * @param value the leadTime - Lead Time Attribute(number of days dealer generally takes to dispatch products)
	 */
	public void setLeadTime(final Integer value)
	{
		setLeadTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Seller.leadTime</code> attribute. 
	 * @param value the leadTime - Lead Time Attribute(number of days dealer generally takes to dispatch products)
	 */
	public void setLeadTime(final SessionContext ctx, final int value)
	{
		setLeadTime( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Seller.leadTime</code> attribute. 
	 * @param value the leadTime - Lead Time Attribute(number of days dealer generally takes to dispatch products)
	 */
	public void setLeadTime(final int value)
	{
		setLeadTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Seller.products</code> attribute.
	 * @return the products - Products
	 */
	public Collection<Product> getProducts(final SessionContext ctx)
	{
		final List<Product> items = getLinkedItems( 
			ctx,
			false,
			NagAccCoreConstants.Relations.SELLERPRODUCTRELATION,
			"Product",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Seller.products</code> attribute.
	 * @return the products - Products
	 */
	public Collection<Product> getProducts()
	{
		return getProducts( getSession().getSessionContext() );
	}
	
	public long getProductsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			NagAccCoreConstants.Relations.SELLERPRODUCTRELATION,
			"Product",
			null
		);
	}
	
	public long getProductsCount()
	{
		return getProductsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Seller.products</code> attribute. 
	 * @param value the products - Products
	 */
	public void setProducts(final SessionContext ctx, final Collection<Product> value)
	{
		setLinkedItems( 
			ctx,
			false,
			NagAccCoreConstants.Relations.SELLERPRODUCTRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SELLERPRODUCTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Seller.products</code> attribute. 
	 * @param value the products - Products
	 */
	public void setProducts(final Collection<Product> value)
	{
		setProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to products. 
	 * @param value the item to add to products - Products
	 */
	public void addToProducts(final SessionContext ctx, final Product value)
	{
		addLinkedItems( 
			ctx,
			false,
			NagAccCoreConstants.Relations.SELLERPRODUCTRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SELLERPRODUCTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to products. 
	 * @param value the item to add to products - Products
	 */
	public void addToProducts(final Product value)
	{
		addToProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from products. 
	 * @param value the item to remove from products - Products
	 */
	public void removeFromProducts(final SessionContext ctx, final Product value)
	{
		removeLinkedItems( 
			ctx,
			false,
			NagAccCoreConstants.Relations.SELLERPRODUCTRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SELLERPRODUCTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from products. 
	 * @param value the item to remove from products - Products
	 */
	public void removeFromProducts(final Product value)
	{
		removeFromProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Seller.sellerBanner</code> attribute.
	 * @return the sellerBanner - Seller Banner Attribute
	 */
	public Media getSellerBanner(final SessionContext ctx)
	{
		return (Media)getProperty( ctx, SELLERBANNER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Seller.sellerBanner</code> attribute.
	 * @return the sellerBanner - Seller Banner Attribute
	 */
	public Media getSellerBanner()
	{
		return getSellerBanner( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Seller.sellerBanner</code> attribute. 
	 * @param value the sellerBanner - Seller Banner Attribute
	 */
	public void setSellerBanner(final SessionContext ctx, final Media value)
	{
		setProperty(ctx, SELLERBANNER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Seller.sellerBanner</code> attribute. 
	 * @param value the sellerBanner - Seller Banner Attribute
	 */
	public void setSellerBanner(final Media value)
	{
		setSellerBanner( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Seller.sellerName</code> attribute.
	 * @return the sellerName - Seller Name Attribute
	 */
	public String getSellerName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedSeller.getSellerName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, SELLERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Seller.sellerName</code> attribute.
	 * @return the sellerName - Seller Name Attribute
	 */
	public String getSellerName()
	{
		return getSellerName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Seller.sellerName</code> attribute. 
	 * @return the localized sellerName - Seller Name Attribute
	 */
	public Map<Language,String> getAllSellerName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,SELLERNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Seller.sellerName</code> attribute. 
	 * @return the localized sellerName - Seller Name Attribute
	 */
	public Map<Language,String> getAllSellerName()
	{
		return getAllSellerName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Seller.sellerName</code> attribute. 
	 * @param value the sellerName - Seller Name Attribute
	 */
	public void setSellerName(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedSeller.setSellerName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, SELLERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Seller.sellerName</code> attribute. 
	 * @param value the sellerName - Seller Name Attribute
	 */
	public void setSellerName(final String value)
	{
		setSellerName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Seller.sellerName</code> attribute. 
	 * @param value the sellerName - Seller Name Attribute
	 */
	public void setAllSellerName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,SELLERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Seller.sellerName</code> attribute. 
	 * @param value the sellerName - Seller Name Attribute
	 */
	public void setAllSellerName(final Map<Language,String> value)
	{
		setAllSellerName( getSession().getSessionContext(), value );
	}
	
}
