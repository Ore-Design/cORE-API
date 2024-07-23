package design.ore.cOREAPI.datatypes.SQL;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(UserProductArgument.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class UserProductArgument_ {

	public static final String ASSOCIATED_PRODUCT = "associatedProduct";
	public static final String ID = "id";
	public static final String USER = "user";
	public static final String VALUE = "value";
	public static final String KEY = "key";

	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.UserProductArgument#associatedProduct
	 **/
	public static volatile SingularAttribute<UserProductArgument, Product> associatedProduct;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.UserProductArgument#id
	 **/
	public static volatile SingularAttribute<UserProductArgument, Long> id;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.UserProductArgument
	 **/
	public static volatile EntityType<UserProductArgument> class_;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.UserProductArgument#user
	 **/
	public static volatile SingularAttribute<UserProductArgument, UserMetadata> user;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.UserProductArgument#value
	 **/
	public static volatile SingularAttribute<UserProductArgument, String> value;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.UserProductArgument#key
	 **/
	public static volatile SingularAttribute<UserProductArgument, String> key;

}

