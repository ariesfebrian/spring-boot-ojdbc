package id.induction.java.springbootojdbc.repository;

import id.induction.java.springbootojdbc.model.entity.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobsRepository extends JpaRepository<Jobs, String> {

    @Query(nativeQuery = true, value = "select j.* from jobs j inner join employees e on e.job_id = j.job_id where j.max_salary > :maxSalary and e.manager_id = :managerId")
    List<Jobs> findAllJobByMaxSalaryAndManagerId(Integer maxSalary, Integer managerId);
}
