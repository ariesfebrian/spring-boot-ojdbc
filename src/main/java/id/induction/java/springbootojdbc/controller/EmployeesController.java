package id.induction.java.springbootojdbc.controller;

import id.induction.java.springbootojdbc.model.entity.Employees;
import id.induction.java.springbootojdbc.model.request.DepartmentAndSalaryRequest;
import id.induction.java.springbootojdbc.model.request.EmployeeRequest;
import id.induction.java.springbootojdbc.model.request.ManagerIdAndJobIdRequest;
import id.induction.java.springbootojdbc.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeesController {

    @Autowired
    EmployeesService employeesService;

    @GetMapping("/list")
    public List<Employees> listAll(){
        return employeesService.findAll();
    }

    @GetMapping("/{id}")
    public Employees getByEmployeeId(@PathVariable Integer id){
        return employeesService.getByEmployeeId(id);
    }

    @GetMapping("/optional/{id}")
    public Optional<Employees> optionalFindById(@PathVariable Integer id){
        return employeesService.findById(id);
    }

    @PostMapping("/list-department-salary")
    public List<Employees> listEmployeeByDepartmentAndSalary(@RequestBody DepartmentAndSalaryRequest request){
        return employeesService.getEmployeeByDepartmentIdAndSalary(request);
    }

    @PostMapping("/list-hired-date-job")
    public List<Employees> listEmployeeByManagerIdAndJobId(@RequestBody ManagerIdAndJobIdRequest request){
        return employeesService.getEmployeeByManagerIdAndJobId(request);
    }

    @PostMapping("/update/{employeeId}")
    public void update(@PathVariable Integer employeeId, @RequestBody EmployeeRequest request){
        employeesService.updateEmployee(employeeId, request);
    }

    @PostMapping("/delete/{employeeId}")
    public void delete(@PathVariable Integer employeeId){
        employeesService.deleteEmployee(employeeId);
    }

    @GetMapping("/list-left-join")
    public List<Employees> listAllLeftJoin(){
        return employeesService.getEmployeeAndDepartmentNameWithLeftJoin();
    }

    @GetMapping("/list-right-join")
    public List<Employees> listAllRightJoin(){
        return employeesService.getAllFullNameAndDepartmentNameWithRightJoin();
    }

    @GetMapping("/list-full-outer-join")
    public List<Employees> listAllFullOuterJoin(){
        return employeesService.getAllFullNameAndDepartmentNameWithFullOuterJoin();
    }
}
