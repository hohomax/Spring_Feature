package com.spring.aop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class AopTest_Controller {


    @GetMapping("/aop/test")
    public String aopTest(@RequestParam String log){


        return "200";
    }
}
