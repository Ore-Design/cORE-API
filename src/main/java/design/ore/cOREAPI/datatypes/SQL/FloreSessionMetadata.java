package design.ore.cOREAPI.datatypes.SQL;

import java.sql.Timestamp;

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
	@Id
	@Column(name="id", nullable=false)
	Long id;
	@Column(name="pausedMinutes", nullable=false, columnDefinition = "bigint default 0")
	Long pausedMinutes;
	Timestamp pausedTime;
}
