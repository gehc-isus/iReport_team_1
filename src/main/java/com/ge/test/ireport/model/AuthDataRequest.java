package com.ge.test.ireport.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AuthDataRequest {
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    public String username;
    public String password;
}
