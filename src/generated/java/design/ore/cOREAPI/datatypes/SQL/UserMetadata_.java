package design.ore.cOREAPI.datatypes.SQL;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.util.UUID;

@StaticMetamodel(UserMetadata.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class UserMetadata_ {

	public static final String INVITES = "invites";
	public static final String ID = "id";
	public static final String TITLE = "title";
	public static final String USER_PRODUCT_ARGUMENTS = "userProductArguments";

	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.UserMetadata#invites
	 **/
	public static volatile ListAttribute<UserMetadata, OrganizationInvite> invites;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.UserMetadata#id
	 **/
	public static volatile SingularAttribute<UserMetadata, UUID> id;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.UserMetadata#title
	 **/
	public static volatile SingularAttribute<UserMetadata, String> title;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.UserMetadata
	 **/
	public static volatile EntityType<UserMetadata> class_;
	
	/**
	 * @see design.ore.cOREAPI.datatypes.SQL.UserMetadata#userProductArguments
	 **/
	public static volatile ListAttribute<UserMetadata, UserProductArgument> userProductArguments;

}

