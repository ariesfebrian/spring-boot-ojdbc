package id.induction.java.springbootojdbc.service;

import id.induction.java.springbootojdbc.model.entity.Jobs;

import java.util.List;

public interface JobsService {

    List<Jobs> findAllJobByMaxSalaryAndManagerId(Integer maxSalary, Integer managerId);
}
