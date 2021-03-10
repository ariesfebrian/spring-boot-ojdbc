package id.induction.java.springbootojdbc.controller;

import id.induction.java.springbootojdbc.service.JobsHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/jobs-history")
public class JobsHistoryController {

    @Autowired
    JobsHistoryService jobsHistoryService;

    @PostMapping("/merge-employee-jobs-history")
    public void mergeEmployeeJobsHistory(){
        jobsHistoryService.mergeEmployeeAndJobHistory();
    }
}
