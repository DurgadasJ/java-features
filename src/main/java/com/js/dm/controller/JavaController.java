package com.js.dm.controller;

import com.js.dm.model.Employee;
import com.js.dm.service.JavaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaController {

    @Autowired
    JavaService javaService;

    @GetMapping("/java")
    public Employee javaApi(){

        return javaService.executeJavaFeature();

    }
}
