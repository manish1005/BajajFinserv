package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.A;
import com.example.demo.repository.A_repository;

@Service
public class A_service {

	
	@Autowired
	A_repository arepo;
	
	public String status;
	
	public A savec(A a)
	{
		//insert operation in the database
		return arepo.save(a);
	}
}
