package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.businnes.abstracts.JobPositionService;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("api/jobpositions")
public class JobPositionController {

	private JobPositionService jobPositionService;

	@Autowired
	public JobPositionController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}

	@GetMapping("/getAll")
	public List<JobPosition> getAll() {

		return this.jobPositionService.getAll();

	}
	
	@PostMapping(name="/add")
	Result add(JobPosition jobPosition) {
		
		return this.jobPositionService.add(jobPosition);
	}

}
