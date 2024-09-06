package com.example.demo.controllers;

import com.example.demo.models.TestClass;
import com.example.demo.repositories.TestRepository;
import com.example.demo.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    private TestService testService;

    public TestController(TestService testService){
        this.testService = testService;
    }
    @GetMapping
    public String helloWorld(){
       return testService.helloWorld();
    }

    @PostMapping
    public void insert(TestClass test){
        TestRepository.save(test);
    }

}
