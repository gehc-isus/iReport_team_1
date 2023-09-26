package com.ge.test.ireport.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

public class ListResponse {
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    public String medicalId;
    public String metadata;
    public String medicalReport;

    public ListResponse(String medicalId, String metadata, String medicalReport) {
        this.medicalId = medicalId;
        this.metadata = metadata;
        this.medicalReport = medicalReport;
    }
}
