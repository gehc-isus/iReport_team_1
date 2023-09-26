package com.ge.test.ireport.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/report/")
public class IReportDataController {

    @GetMapping("/list")
    public String getReportList(){

        return "reportList";
    }

    @GetMapping("/{id}")
    public String getReport(@PathVariable String reportId){

        return "report";
    }

    @GetMapping("/{id}")
    public String saveReport(@RequestParam String report){

        return "report created";
    }
}
