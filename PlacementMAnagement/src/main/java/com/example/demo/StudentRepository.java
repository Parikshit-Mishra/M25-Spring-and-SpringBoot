package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
//JAP Repository is exist in spring Data JPA dependency and it contain 
// all CURD operation of spring JPA
public interface StudentRepository extends JpaRepository<Student,Integer>{

}
