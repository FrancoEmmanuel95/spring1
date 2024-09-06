package com.example.demo.repositories;

import com.example.demo.models.TestClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<TestClass,String> {



}
