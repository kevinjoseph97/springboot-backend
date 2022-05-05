package com.infy.springbootbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.springbootbackend.DTO.EmployeeDTO;
import com.infy.springbootbackend.exception.EmplNotFoundException;
import com.infy.springbootbackend.model.City;
import com.infy.springbootbackend.model.Employee;
import com.infy.springbootbackend.repository.CityRepository;
import com.infy.springbootbackend.repository.EmployeeRepository;
import com.infy.springbootbackend.service.EmployeeService;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private Environment environment;
	

	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
	

	@PostMapping("/employees")
	public ResponseEntity<Integer> createEmployee(@RequestBody EmployeeDTO employeeDTO  ){
		Integer e = employeeService.addEmployee(employeeDTO);
		return new ResponseEntity<Integer>(e, HttpStatus.CREATED);
	}
	
	
//	
//	//fetch an employee
//	//use responseEntity since we have custom 
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmplById(@PathVariable Integer id){
//		Employee employee = employeeRepository.(id).orElseThrow(
//				() -> new EmplNotFoundException("Could not find Employee"));
//		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
		
		
		return null;
	}
	
	
	//update empl
//	@PutMapping("/employees/{id}");
//	public ResponseEntity<Employee> updateEmpl(@PathVariable Long id, @RequestBody Employee emplInfo){
//		Employee employee = employeeRepository.findById(id).orElseThrow(
//				() -> new EmplNotFoundException("Could not find Employee"));
//		employee.setFirstName(emplInfo.getFirstName());
//		employee.setLastName(emplInfo.getLastName());
//		employee.setJoiningDate(emplInfo.getJoiningDate());
//		employee.setPhoneNumber(emplInfo.getPhoneNumber());
//		employee.setEmailAddress(emplInfo.getEmailAddress());
//		employee.setDesignation(emplInfo.getDesignation());
//		employee.setCity(emplInfo.getCity()); 
//		Employee updatedEmpl = employeeRepository.save(employee);
//		//return ResponseEntity.ok(updatedEmpl);
//		return new ResponseEntity<Employee>(updatedEmpl, HttpStatus.OK);
//		
//	}
	
	

	
}
