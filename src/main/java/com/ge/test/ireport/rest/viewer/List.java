package com.ge.test.ireport.rest.viewer;

import com.ge.test.ireport.model.ListResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/viewer")
public class List {

    @GetMapping("/list")
    public ListResponse getList() {

        return new ListResponse();
    }
    @GetMapping("/{id}")
    public String getListById() {

        return "OK";
    }
}
