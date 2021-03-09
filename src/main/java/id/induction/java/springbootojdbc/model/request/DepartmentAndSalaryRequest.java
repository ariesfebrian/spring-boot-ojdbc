package id.induction.java.springbootojdbc.model.request;

import lombok.Data;

@Data
public class DepartmentAndSalaryRequest {
    private Integer departmentId;

    private Integer salary;
}
