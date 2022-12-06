package kodlamaio.hrms.businnes.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.businnes.abstracts.CandidateService;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.core.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService {

	private CandidateDao candidateDao;

	@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
	}

	@Override
	public Result add(Candidate candidate) {

	

		this.candidateDao.save(candidate);
		return new SuccessResult("Candidate Eklendi.");
	}

	@Override
	public List<Candidate> getAll() {
		
		return this.candidateDao.findAll();
	}

}
