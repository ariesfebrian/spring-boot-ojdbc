package id.induction.java.springbootojdbc.service.impl;

import id.induction.java.springbootojdbc.model.entity.Jobs;
import id.induction.java.springbootojdbc.repository.JobsRepository;
import id.induction.java.springbootojdbc.service.JobsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobsServiceImpl implements JobsService {

    @Autowired
    JobsRepository jobsRepository;

    @Override
    public List<Jobs> findAllJobByMaxSalaryAndManagerId(Integer maxSalary, Integer managerId) {
        return jobsRepository.findAllJobByMaxSalaryAndManagerId(maxSalary, managerId);
    }
}
