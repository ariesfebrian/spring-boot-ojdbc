package id.induction.java.springbootojdbc.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "JOB_HISTORY")
public class JobHistory {
    @Id
    private Integer employeeId;

    private Date startDate;

    private Date endDate;

    private String jobId;

    private Integer departmentId;
}
