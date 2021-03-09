package id.induction.java.springbootojdbc.service.impl;

import id.induction.java.springbootojdbc.model.entity.Employees;
import id.induction.java.springbootojdbc.model.request.DepartmentAndSalaryRequest;
import id.induction.java.springbootojdbc.model.request.ManagerIdAndJobIdRequest;
import id.induction.java.springbootojdbc.repository.EmployeesRepository;
import id.induction.java.springbootojdbc.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeesServiceImpl implements EmployeesService {

    @Autowired
    EmployeesRepository employeesRepository;

    @Override
    public Optional<Employees> findById(Integer employeeId) {
        return employeesRepository.findById(employeeId);
    }

    @Override
    public List<Employees> findAll() {
        return employeesRepository.findAll();
    }

    @Override
    public Employees getByEmployeeId(Integer employeeId) {
        return employeesRepository.getByEmployeeId(employeeId);
    }

    @Override
    public List<Employees> getEmployeeByDepartmentIdAndSalary(DepartmentAndSalaryRequest request) {
        return employeesRepository.getEmployeeByDepartmentIdAndSalary(request.getDepartmentId(), request.getSalary());
    }

    @Override
    public List<Employees> getEmployeeByManagerIdAndJobId(ManagerIdAndJobIdRequest request) {
        return employeesRepository.getEmployeeByManagerIdAndJobId(request.getManagerId(), request.getJobId());
    }
}
