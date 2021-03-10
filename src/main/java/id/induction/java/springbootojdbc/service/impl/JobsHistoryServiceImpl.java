package id.induction.java.springbootojdbc.service.impl;

import id.induction.java.springbootojdbc.repository.JobsHistoryRepository;
import id.induction.java.springbootojdbc.service.JobsHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobsHistoryServiceImpl implements JobsHistoryService {

    @Autowired
    private JobsHistoryRepository jobsHistoryRepository;

    @Override
    public void mergeEmployeeAndJobHistory() {
        jobsHistoryRepository.mergeEmployeeAndJobHistory();
    }
}
