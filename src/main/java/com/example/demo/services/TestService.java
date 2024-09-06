package com.example.demo.services;

import com.example.demo.models.TestClass;
import com.example.demo.repositories.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class TestService {
    @Autowired
    private TestRepository testRepository;

    public String helloWorld(){
        return "Hello Wolrd!";
    }
    public void insert(TestClass test){
        TestRepository.save(test);
    }
}
