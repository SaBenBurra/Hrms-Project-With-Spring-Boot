package burra.hrms.webApi;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import burra.hrms.business.services.abstracts.JobTitleService;
import burra.hrms.core.utilities.results.DataResult;
import burra.hrms.entities.concretes.JobTitle;

@RestController
@RequestMapping("/api/jobTitles")
public class JobTitlesController {
  private JobTitleService jobTitleService;

  public JobTitlesController(JobTitleService jobTitleService) {
    this.jobTitleService = jobTitleService;
  }

  @GetMapping("/getAll")
  public DataResult<List<JobTitle>> getAll() {
    return jobTitleService.getAll();
  }

}
