package com.infy.springbootbackend.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.springbootbackend.DTO.EmployeeDTO;
import com.infy.springbootbackend.exception.EmplNotFoundException;
import com.infy.springbootbackend.repository.CityRepository;
import com.infy.springbootbackend.repository.DesignationRepository;
import com.infy.springbootbackend.repository.EmployeeRepository;

@Transactional
@Service(value = "emplService")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private CityRepository cityRepository;
	
	@Autowired
	private DesignationRepository designationRepository;
	
	
	

	@Override
	public EmployeeDTO getEmployee(Integer id) throws EmplNotFoundException {
		
		return null;
	}

	@Override
	public List<EmployeeDTO> getAllEmployees() throws EmplNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer addEmployee(EmployeeDTO employeeDTO) throws EmplNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateEmployee(Integer id, EmployeeDTO employeeDTO) throws EmplNotFoundException {
		// TODO Auto-generated method stub
		
	}

}
