package design.ore.cOREAPI.datatypes.SQL;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(OrganizationalProductArgument.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class OrganizationalProductArgument_ {

	public static final String ORGANIZATION = "organization";
	public static final String ASSOCIATED_PRODUCT = "associatedProduct";
	public static final String ID = "id";
	public static final String VALUE = "value";
	public static final String KEY = "key";

	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.OrganizationalProductArgument#organization
	 **/
	public static volatile SingularAttribute<OrganizationalProductArgument, Organization> organization;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.OrganizationalProductArgument#associatedProduct
	 **/
	public static volatile SingularAttribute<OrganizationalProductArgument, Product> associatedProduct;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.OrganizationalProductArgument#id
	 **/
	public static volatile SingularAttribute<OrganizationalProductArgument, Long> id;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.OrganizationalProductArgument
	 **/
	public static volatile EntityType<OrganizationalProductArgument> class_;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.OrganizationalProductArgument#value
	 **/
	public static volatile SingularAttribute<OrganizationalProductArgument, String> value;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.OrganizationalProductArgument#key
	 **/
	public static volatile SingularAttribute<OrganizationalProductArgument, String> key;

}

