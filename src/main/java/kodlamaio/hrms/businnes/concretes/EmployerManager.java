package kodlamaio.hrms.businnes.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.businnes.abstracts.EmployerService;
import kodlamaio.hrms.core.ErrorResult;
import kodlamaio.hrms.core.Result;
import kodlamaio.hrms.core.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {

	private EmployerDao employerdao;

	@Autowired
	public EmployerManager(EmployerDao employerdao) {
		super();
		this.employerdao = employerdao;
	}

	@Override
	public Result add(Employer employer) {

		if (!employer.getCompanyName().isEmpty()) {

			this.employerdao.save(employer);
			return new SuccessResult("Employer Eklendi.");

		}

		System.out.println("Şirket adı boş bırakılamaz!.");

		return new ErrorResult("Şirket adı boş bırakılamaz!");
	}

	@Override
	public List<Employer> getAll() {

		return this.employerdao.findAll();
	}

}
