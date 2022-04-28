package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.A;

@Repository
public interface A_repository extends JpaRepository<A, Integer> {

}
