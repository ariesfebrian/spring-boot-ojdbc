package id.induction.java.springbootojdbc.repository;

import id.induction.java.springbootojdbc.model.entity.JobHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface JobsHistoryRepository extends JpaRepository<JobHistory, Integer> {
    @Query(nativeQuery = true, value = "MERGE INTO JOB_HISTORY jh " +
            "USING (SELECT * FROM EMPLOYEES) e " +
            "ON (jh.EMPLOYEE_ID = e.EMPLOYEE_ID) " +
            "WHEN MATCHED THEN " +
            "UPDATE SET modified_date = CURRENT_TIMESTAMP " +
            "WHEN NOT MATCHED THEN " +
            "INSERT (employee_id, start_date, end_date, job_id, department_id, modified_date) " +
            "VALUES (e.EMPLOYEE_ID, TO_DATE('09-09-2019'), SYSDATE, e.JOB_ID, e.DEPARTMENT_ID, CURRENT_TIMESTAMP);")
    void mergeEmployeeAndJobHistory();
}
