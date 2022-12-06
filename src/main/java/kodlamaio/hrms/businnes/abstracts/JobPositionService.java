package kodlamaio.hrms.businnes.abstracts;

import java.util.List;

import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.entities.concretes.JobPosition;

public interface JobPositionService {

	List<JobPosition> getAll();
	
	Result add(JobPosition jobposition);
	
	
	

}
