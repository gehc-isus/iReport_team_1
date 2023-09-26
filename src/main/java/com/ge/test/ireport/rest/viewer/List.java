package com.ge.test.ireport.rest.viewer;

import com.ge.test.ireport.model.ListResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/viewer")
public class List {

    @GetMapping("/list")
    public ListResponse[] getList() {

        ListResponse[] resp = new ListResponse[]{
                new ListResponse("232323", "doctor Jim", "give him cigars"),
                new ListResponse("7237723", "doctor bubo", "he is fine."),
                new ListResponse("3432434", "doctor bobek", "he is not fine."),

        };
        return resp;
    }
    @GetMapping("/{id}")
    public ListResponse getListById(String id) {

        
        return new ListResponse("7237723", "doctor bubo", "he is fine.");
    }
}
