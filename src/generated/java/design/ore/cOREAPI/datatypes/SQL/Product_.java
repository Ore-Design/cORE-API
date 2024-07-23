package design.ore.cOREAPI.datatypes.SQL;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Product.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class Product_ {

	public static final String PRODUCT_ARGUMENTS = "productArguments";
	public static final String LOGO_PATH = "logoPath";
	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";
	public static final String MAC_BLOB_NAME = "macBlobName";
	public static final String ID = "id";
	public static final String A_CC_ES_S__OR_GA_NI_ZA_TI_ON__MA_PP_IN_G = "ACCESS_ORGANIZATION_MAPPING";
	public static final String WINDOWS_BLOB_NAME = "windowsBlobName";

	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.Product#productArguments
	 **/
	public static volatile ListAttribute<Product, ProductArgument> productArguments;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.Product#logoPath
	 **/
	public static volatile SingularAttribute<Product, String> logoPath;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.Product#name
	 **/
	public static volatile SingularAttribute<Product, String> name;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.Product#description
	 **/
	public static volatile SingularAttribute<Product, String> description;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.Product#macBlobName
	 **/
	public static volatile SingularAttribute<Product, String> macBlobName;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.Product#id
	 **/
	public static volatile SingularAttribute<Product, Long> id;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.Product#ACCESS_ORGANIZATION_MAPPING
	 **/
	public static volatile ListAttribute<Product, Organization> ACCESS_ORGANIZATION_MAPPING;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.Product
	 **/
	public static volatile EntityType<Product> class_;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.Product#windowsBlobName
	 **/
	public static volatile SingularAttribute<Product, String> windowsBlobName;

}

