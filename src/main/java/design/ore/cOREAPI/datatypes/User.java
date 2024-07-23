package design.ore.cOREAPI.datatypes;

import java.util.Map;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import design.ore.cOREAPI.datatypes.SQL.Organization;
import design.ore.cOREAPI.datatypes.SQL.UserMetadata;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The User class is used as a wrapper for combining {@link UserMetadata}
 * from the user SQL database and authentication data from KeyCloak into
 * a single readable format that can be returned via the cORE REST API.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@JsonInclude(Include.NON_NULL)
public class User
{
	UUID id;
	String firstName;
	String lastName;
	String email;
	String title;
	Map<String, String> userProductArguments;
	Organization organization;
	
	public void appendMetadata(UserMetadata metadata)
	{
		userProductArguments = metadata.getUserProductArgumentsAsMap();
		title = metadata.getTitle();
	}
	
	@JsonIgnore
	public String getName() { return firstName + " " + lastName; }
}
