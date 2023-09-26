package com.ge.test.ireport.rest;

import com.ge.test.ireport.model.UploadDataRequest;
import com.ge.test.ireport.model.UploadDataResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1/upload")
public class UploaderAPIv1 {

    @PostMapping
    public UploadDataResponse uploadMedicalReport(UploadDataRequest data) {

        // validate data
        return new UploadDataResponse();
    }
}
