package design.ore.cOREAPI.datatypes.SQL;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "cORE_NCR_ID_Tracker")
@JsonInclude(Include.NON_NULL)
public class flORENCRID
{
	@TableGenerator(initialValue = 10000000, name = "flORE_NCR_ID_Gen")
	@Id
	@Column(nullable = false)
	long id;
}
