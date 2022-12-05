package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StudentService {
	
	@Autowired
	private StudentRepository repo;
	
	//To retrieve all the data of student class
	
	public List<Student>ListAll()
	{
		return repo.findAll();
	}
	//insert/create/update a data
	public void create (Student s)
	{
		repo.save(s);
	}
	// To retrieve a single record 
	public Student retrieve (Integer id)
	{
		return repo.findById(id).get();
	}
	//To delete a data
	public void delete (Integer id)
	{
		repo.deleteById(id);
	}
}
