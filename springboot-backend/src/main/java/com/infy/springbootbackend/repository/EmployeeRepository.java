package com.infy.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.springbootbackend.model.Employee;


//extend JPA as it gives 
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
