package kodlamaio.hrms.businnes.abstracts;

import java.util.List;

import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.entities.concretes.Candidate;

public interface CandidateService  {
	
	Result add(Candidate candidate);
	List<Candidate> getAll();

}
