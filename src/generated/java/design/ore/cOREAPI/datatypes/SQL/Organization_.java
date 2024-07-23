package design.ore.cOREAPI.datatypes.SQL;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.util.UUID;

@StaticMetamodel(Organization.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class Organization_ {

	public static final String COUNTRY = "country";
	public static final String ADDRESS2 = "address2";
	public static final String CITY = "city";
	public static final String ADDRESS1 = "address1";
	public static final String PLUGINS = "plugins";
	public static final String POSTAL_CODE = "postalCode";
	public static final String STATE_PROVINCE = "stateProvince";
	public static final String PRODUCTS = "products";
	public static final String ORGANIZATION_PRODUCT_ARGUMENTS = "organizationProductArguments";
	public static final String NAME = "name";
	public static final String INVITES = "invites";
	public static final String ID = "id";

	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.Organization#country
	 **/
	public static volatile SingularAttribute<Organization, String> country;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.Organization#address2
	 **/
	public static volatile SingularAttribute<Organization, String> address2;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.Organization#city
	 **/
	public static volatile SingularAttribute<Organization, String> city;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.Organization#address1
	 **/
	public static volatile SingularAttribute<Organization, String> address1;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.Organization#plugins
	 **/
	public static volatile ListAttribute<Organization, ProductPlugin> plugins;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.Organization#postalCode
	 **/
	public static volatile SingularAttribute<Organization, Integer> postalCode;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.Organization#stateProvince
	 **/
	public static volatile SingularAttribute<Organization, String> stateProvince;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.Organization#products
	 **/
	public static volatile ListAttribute<Organization, Product> products;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.Organization#organizationProductArguments
	 **/
	public static volatile ListAttribute<Organization, OrganizationalProductArgument> organizationProductArguments;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.Organization#name
	 **/
	public static volatile SingularAttribute<Organization, String> name;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.Organization#invites
	 **/
	public static volatile ListAttribute<Organization, OrganizationInvite> invites;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.Organization#id
	 **/
	public static volatile SingularAttribute<Organization, UUID> id;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.Organization
	 **/
	public static volatile EntityType<Organization> class_;

}

