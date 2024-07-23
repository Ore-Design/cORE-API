package design.ore.cOREAPI.datatypes.SQL;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.util.Date;

@StaticMetamodel(ProductPlugin.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class ProductPlugin_ {

	public static final String PLUGIN_MAJOR_VERSION = "pluginMajorVersion";
	public static final String FILE_NAME = "fileName";
	public static final String TARGET_MAJOR_VERSION = "targetMajorVersion";
	public static final String ASSOCIATED_ORGANIZATION = "associatedOrganization";
	public static final String TARGET_MINOR_VERSION = "targetMinorVersion";
	public static final String PLUGIN_MINOR_VERSION = "pluginMinorVersion";
	public static final String TARGET_BUGFIX_VERSION = "targetBugfixVersion";
	public static final String CREATED_DATE = "createdDate";
	public static final String NAME = "name";
	public static final String ASSOCIATED_PRODUCT = "associatedProduct";
	public static final String ID = "id";
	public static final String PLUGIN_BUGFIX_VERSION = "pluginBugfixVersion";

	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.ProductPlugin#pluginMajorVersion
	 **/
	public static volatile SingularAttribute<ProductPlugin, Integer> pluginMajorVersion;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.ProductPlugin#fileName
	 **/
	public static volatile SingularAttribute<ProductPlugin, String> fileName;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.ProductPlugin#targetMajorVersion
	 **/
	public static volatile SingularAttribute<ProductPlugin, Integer> targetMajorVersion;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.ProductPlugin#associatedOrganization
	 **/
	public static volatile SingularAttribute<ProductPlugin, Organization> associatedOrganization;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.ProductPlugin#targetMinorVersion
	 **/
	public static volatile SingularAttribute<ProductPlugin, Integer> targetMinorVersion;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.ProductPlugin#pluginMinorVersion
	 **/
	public static volatile SingularAttribute<ProductPlugin, Integer> pluginMinorVersion;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.ProductPlugin#targetBugfixVersion
	 **/
	public static volatile SingularAttribute<ProductPlugin, Integer> targetBugfixVersion;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.ProductPlugin#createdDate
	 **/
	public static volatile SingularAttribute<ProductPlugin, Date> createdDate;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.ProductPlugin#name
	 **/
	public static volatile SingularAttribute<ProductPlugin, String> name;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.ProductPlugin#associatedProduct
	 **/
	public static volatile SingularAttribute<ProductPlugin, Product> associatedProduct;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.ProductPlugin#id
	 **/
	public static volatile SingularAttribute<ProductPlugin, Long> id;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.ProductPlugin#pluginBugfixVersion
	 **/
	public static volatile SingularAttribute<ProductPlugin, Integer> pluginBugfixVersion;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.ProductPlugin
	 **/
	public static volatile EntityType<ProductPlugin> class_;

}

