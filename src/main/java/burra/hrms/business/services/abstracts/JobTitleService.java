package burra.hrms.business.services.abstracts;

import java.util.List;

import burra.hrms.core.utilities.results.DataResult;
import burra.hrms.entities.concretes.JobTitle;

public interface JobTitleService {
  public DataResult<List<JobTitle>> getAll();
}
