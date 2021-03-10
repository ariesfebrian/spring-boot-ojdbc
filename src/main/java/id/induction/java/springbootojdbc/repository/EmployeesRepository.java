package id.induction.java.springbootojdbc.repository;

import id.induction.java.springbootojdbc.model.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Integer> {
    Employees getByEmployeeId(Integer employeeId);

    @Query(name = "SELECT e FROM employees e WHERE e.departmentId = :department AND e.salary = :salary")
    List<Employees> getEmployeeByDepartmentIdAndSalary(Integer department, Integer salary);

    @Query(name = "SELECT * FROM EMPLOYEES WHERE MANAGER_ID = :managerId AND job_id = :jobId", nativeQuery = true)
    List<Employees> getEmployeeByManagerIdAndJobId(Integer managerId, String jobId);

    @Query(value = "SELECT e.* FROM EMPLOYEES e LEFT JOIN DEPARTMENTS d ON d.DEPARTMENT_ID = e.DEPARTMENT_ID", nativeQuery = true)
    List<Employees> leftJoin();

    @Query(value = "SELECT e.* FROM EMPLOYEES e RIGHT JOIN DEPARTMENTS d ON d.DEPARTMENT_ID = e.DEPARTMENT_ID", nativeQuery = true)
    List<Employees> rightJoin();

    @Query(value = "SELECT e.* FROM EMPLOYEES e FULL OUTER JOIN DEPARTMENTS d ON d.DEPARTMENT_ID = e.DEPARTMENT_ID " +
            "WHERE e.FIRST_NAME IS NULL OR e.DEPARTMENT_ID IS NULL", nativeQuery = true)
    List<Employees> fullOuterJoin();
}