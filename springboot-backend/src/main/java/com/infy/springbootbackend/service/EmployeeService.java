package com.infy.springbootbackend.service;

import java.util.List;

import com.infy.springbootbackend.DTO.EmployeeDTO;
import com.infy.springbootbackend.exception.EmplNotFoundException;

public interface EmployeeService {
	
	public EmployeeDTO getEmployee(Integer id);
	public List<EmployeeDTO> getAllEmployees();
	public Integer addEmployee(EmployeeDTO employeeDTO);
	public void updateEmployee(Integer id, EmployeeDTO employeeDTO);
	List<String> getDesignations() throws EmplNotFoundException;
	List<String> getCitys() throws EmplNotFoundException;
	
}
 


