package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name="job_titles")
@Data
public class JobPosition {
	
    public JobPosition() {
		super();
	}
	public JobPosition(int id, String position) {
		super();
		this.id = id;
		this.position = position;
	}
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="title")
    private String position;
    
    
}
