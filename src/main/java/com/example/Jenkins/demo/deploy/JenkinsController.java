package com.example.Jenkins.demo.deploy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {


    @RequestMapping("/hello")
    public String HelloPage(){
        return "This is hello page";
    }

    @RequestMapping("test-jenkins")
    public String TestJenkins(){
        return "This is Test Jenkins Page";
    }
}
