package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.businnes.abstracts.EmployerService;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.entities.concretes.Employer;


@RestController
@RequestMapping("/employer")
public class EmployerController {
	
	private EmployerService employerservice;
    
	@Autowired
	public EmployerController(EmployerService employerservice) {
		super();
		this.employerservice = employerservice;
	}

	@PostMapping(name = "/add")
	Result add(@RequestBody Employer employer) {
		
		return this.employerservice.add(employer);
		
	}
	
	@GetMapping("/getAll")
	public List<Employer> getAll() {

		return this.employerservice.getAll();

	}
	
	
	
	
	
	

}

