package com.ge.test.ireport.rest;

import com.ge.test.ireport.storage.FileStorage;
import com.ge.test.ireport.model.UploadDataRequest;
import com.ge.test.ireport.model.UploadDataResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("api/v1/upload")
public class UploaderAPIv1 {

    @PostMapping
    public UploadDataResponse uploadMedicalReport(UploadDataRequest data) throws IOException {

        // validate data
        // TODO
        // store
        FileStorage.storeData(data.medicalId+"_"+data.hospitalId, data.metadata+data.medicalReport);

        return new UploadDataResponse("Data validity OK. Save success.");
    }
}
