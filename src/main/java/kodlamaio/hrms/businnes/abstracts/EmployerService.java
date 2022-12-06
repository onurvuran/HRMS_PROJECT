package kodlamaio.hrms.businnes.abstracts;

import java.util.List;

import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.entities.concretes.Employer;

public interface EmployerService {
	
	
    List<Employer> getAll();
   
	Result add(Employer employer);

}
