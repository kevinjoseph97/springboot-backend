package com.infy.springbootbackend.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infy.springbootbackend.model.Employee;


//extend JPA as it gives 
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
