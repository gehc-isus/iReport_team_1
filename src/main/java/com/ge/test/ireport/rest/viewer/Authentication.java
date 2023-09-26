package com.ge.test.ireport.rest.viewer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1/viewer/authentication")
public class Authentication {

    @GetMapping
    String getToken() {

        return "token";
    }
}
