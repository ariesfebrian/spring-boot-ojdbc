package id.induction.java.springbootojdbc.model.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeDepartmentResponse {

    private String fullName;

    private String departmentName;
}
