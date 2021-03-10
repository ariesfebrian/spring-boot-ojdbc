package id.induction.java.springbootojdbc.service;

import id.induction.java.springbootojdbc.model.entity.Employees;
import id.induction.java.springbootojdbc.model.request.DepartmentAndSalaryRequest;
import id.induction.java.springbootojdbc.model.request.EmployeeRequest;
import id.induction.java.springbootojdbc.model.request.ManagerIdAndJobIdRequest;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface EmployeesService {

    Optional<Employees> findById(Integer employeeId);

    List<Employees> findAll();

    Employees getByEmployeeId(Integer employeeId);

    List<Employees> getEmployeeByDepartmentIdAndSalary(DepartmentAndSalaryRequest departmentAndSalaryRequest);

    List<Employees> getEmployeeByManagerIdAndJobId(ManagerIdAndJobIdRequest request);

    ResponseEntity updateEmployee(Integer employeeId, EmployeeRequest request);

    void deleteEmployee(Integer employeeId);

    List<Employees> getEmployeeAndDepartmentNameWithLeftJoin();

    List<Employees> getAllFullNameAndDepartmentNameWithRightJoin();

    List<Employees> getAllFullNameAndDepartmentNameWithFullOuterJoin();
}
