package design.ore.cOREAPI.datatypes.SQL;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(OrganizationInvite.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class OrganizationInvite_ {

	public static final String INVITEE_EMAIL = "inviteeEmail";
	public static final String ORGANIZATION = "organization";
	public static final String HANDLED = "handled";
	public static final String SENT_TIMESTAMP = "sentTimestamp";
	public static final String ID = "id";
	public static final String USER = "user";

	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.OrganizationInvite#inviteeEmail
	 **/
	public static volatile SingularAttribute<OrganizationInvite, String> inviteeEmail;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.OrganizationInvite#organization
	 **/
	public static volatile SingularAttribute<OrganizationInvite, Organization> organization;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.OrganizationInvite#handled
	 **/
	public static volatile SingularAttribute<OrganizationInvite, Boolean> handled;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.OrganizationInvite#sentTimestamp
	 **/
	public static volatile SingularAttribute<OrganizationInvite, Long> sentTimestamp;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.OrganizationInvite#id
	 **/
	public static volatile SingularAttribute<OrganizationInvite, Long> id;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.OrganizationInvite
	 **/
	public static volatile EntityType<OrganizationInvite> class_;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.OrganizationInvite#user
	 **/
	public static volatile SingularAttribute<OrganizationInvite, UserMetadata> user;

}

