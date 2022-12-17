package burra.hrms.business.services.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import burra.hrms.business.services.abstracts.JobTitleService;
import burra.hrms.core.utilities.results.DataResult;
import burra.hrms.core.utilities.results.SuccessDataResult;
import burra.hrms.dataAccess.abstracts.JobTitleRepository;
import burra.hrms.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService {

  private JobTitleRepository jobTitleRepository;

  public JobTitleManager(JobTitleRepository jobTitleRepository) {
    this.jobTitleRepository = jobTitleRepository;
  }

  @Override
  public DataResult<List<JobTitle>> getAll() {
    return new SuccessDataResult<List<JobTitle>>(jobTitleRepository.findAll(), "iş pozisyonları listelendi");
  }

}
