package design.ore.api.core.datatypes.SQL;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "cORE_FLORE_SESSION_METADATA")
@JsonInclude(Include.NON_NULL)
public class FloreSessionMetadata
{
	public FloreSessionMetadata(long id, long userId)
	{
		this.id = id;
		this.userId = userId;
		pausedMillis = 0L;
		appliedMillis = 0L;
		paused = false;
	}
	
	@Id
	@Column(name="id", nullable=false)
	Long id;
	@Column(name="userId", nullable=false)
	Long userId;
	@Column(name="pausedMillis", nullable=false, columnDefinition = "bigint default 0")
	Long pausedMillis;
	@Column(name="appliedMillis", nullable=false, columnDefinition = "bigint default 0")
	Long appliedMillis;
	boolean paused = false;
}
