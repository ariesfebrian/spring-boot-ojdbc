package id.induction.java.springbootojdbc.model.request;

import lombok.Data;

@Data
public class ManagerIdAndJobIdRequest {
    private Integer managerId;

    private String jobId;
}
