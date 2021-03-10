package id.induction.java.springbootojdbc.model.request;

import lombok.Data;

@Data
public class EmployeeRequest {

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private Integer salary;
}
