package com.ge.test.ireport.rest;

import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/{id}")
    public String saveReport(@RequestParam String report){

        return "report created";
    }
}
