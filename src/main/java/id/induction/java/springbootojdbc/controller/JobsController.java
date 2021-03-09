package id.induction.java.springbootojdbc.controller;

import id.induction.java.springbootojdbc.model.entity.Jobs;
import id.induction.java.springbootojdbc.service.JobsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/jobs")
public class JobsController {

    @Autowired
    JobsService jobsService;

    @GetMapping("/list/{maxSalary}/{managerId}")
    public List<Jobs> findAllJobByMaxSalary(@PathVariable Integer maxSalary, @PathVariable Integer managerId){
        return jobsService.findAllJobByMaxSalaryAndManagerId(maxSalary, managerId);
    }
}
