package kodlamaio.hrms.businnes.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.businnes.abstracts.JobPositionService;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.core.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {
	
    private JobPositionDao jobPositionDao;
    
    @Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public List<JobPosition> getAll() {
		
		return jobPositionDao.findAll();
	}

	@Override
	public Result add(JobPosition jobposition) {
		this.jobPositionDao.save(jobposition);
		return new SuccessResult("eklendi.");
	}

}
