package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.businnes.abstracts.CandidateService;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.entities.concretes.Candidate;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

	private CandidateService candidateService;

	@Autowired
	public CandidateController(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
	}

	@PostMapping(name = "/add")
	Result add(@RequestBody Candidate candidate) {

		return this.candidateService.add(candidate);

	}
	
	@GetMapping("/getAll")
	public List<Candidate> getAll() {

		return this.candidateService.getAll();

	}

}
