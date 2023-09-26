package com.ge.test.ireport.rest.viewer;

import com.ge.test.ireport.model.AuthDataRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController("/api/v1/viewer/authentication")
public class Authentication {

    @GetMapping
    String getToken(AuthDataRequest request) {

        if (Objects.equals(request.username, "Szabi") && Objects.equals(request.password, "A kiraj")) {

            return "This is a valid TOKEN";
        }

        return "INVALID token";
    }
}
