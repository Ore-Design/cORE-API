package design.ore.cOREAPI.datatypes.SQL;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ProductArgument.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class ProductArgument_ {

	public static final String ASSOCIATED_PRODUCT = "associatedProduct";
	public static final String ID = "id";
	public static final String VALUE = "value";
	public static final String KEY = "key";

	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.ProductArgument#associatedProduct
	 **/
	public static volatile SingularAttribute<ProductArgument, Product> associatedProduct;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.ProductArgument#id
	 **/
	public static volatile SingularAttribute<ProductArgument, Long> id;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.ProductArgument
	 **/
	public static volatile EntityType<ProductArgument> class_;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.ProductArgument#value
	 **/
	public static volatile SingularAttribute<ProductArgument, String> value;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.ProductArgument#key
	 **/
	public static volatile SingularAttribute<ProductArgument, String> key;

}

