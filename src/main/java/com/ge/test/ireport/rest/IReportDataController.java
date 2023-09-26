package com.ge.test.ireport.rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("report")
public class IReportDataController {

    @GetMapping("/list")
    public String getReportList(){

        return "reportList";
    }

    @GetMapping("/{reportId}")
    public String getReport(@PathVariable String reportId){

        return "report";
    }

    @PostMapping("/{reportId}")
    public String saveReport(@RequestParam String reportId){

        return "report created";
    }
}
