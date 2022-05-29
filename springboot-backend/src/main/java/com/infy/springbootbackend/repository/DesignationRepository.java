package com.infy.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.springbootbackend.model.Designation;

public interface DesignationRepository extends JpaRepository<Designation, Integer> {
	

}
