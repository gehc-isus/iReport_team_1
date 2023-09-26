package com.ge.test.ireport.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UploadDataResponse {
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    public String validation;
}
