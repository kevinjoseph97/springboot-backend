package com.infy.springbootbackend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.springbootbackend.DTO.CityDTO;
import com.infy.springbootbackend.DTO.DesignationDTO;
import com.infy.springbootbackend.DTO.EmployeeDTO;
import com.infy.springbootbackend.exception.EmplNotFoundException;
import com.infy.springbootbackend.model.City;
import com.infy.springbootbackend.model.Designation;
import com.infy.springbootbackend.model.Employee;
import com.infy.springbootbackend.repository.CityRepository;
import com.infy.springbootbackend.repository.DesignationRepository;
import com.infy.springbootbackend.repository.EmployeeRepository;

@Transactional
@Service(value = "employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private CityRepository cityRepository;
	
	@Autowired
	private DesignationRepository designationRepository;
	
	
	

	@Override
	public EmployeeDTO getEmployee(Integer id) throws EmplNotFoundException {
		
		Optional<Employee> optional = employeeRepository.findById(id);
		Employee employee = optional.orElseThrow(() -> 
			new EmplNotFoundException("Service.EMPLOYEE_NOT_FOUND"));
		
		 EmployeeDTO eDTO = new EmployeeDTO();
		 eDTO.setId(employee.getId());
		 eDTO.setFirstName(employee.getFirstName());
		 eDTO.setLastName(employee.getLastName());
		 eDTO.setEmailAddress(employee.getEmailAddress());
		 eDTO.setJoiningDate(employee.getJoiningDate());
		 eDTO.setPhoneNumber(employee.getPhoneNumber());
		 
		 
		 Designation designation = employee.getDesignation();
		 DesignationDTO dDTO = new DesignationDTO();
		 dDTO.setDesignation(designation.getDesignation());
		 eDTO.setDesignationDTO(dDTO);
		 
		 
		 
		 
		return eDTO;
	}

	@Override
	public List<EmployeeDTO> getAllEmployees() throws EmplNotFoundException {
		Iterable<Employee> employees = employeeRepository.findAll();
		
		List<EmployeeDTO> eDTOs = new ArrayList<EmployeeDTO>();
		employees.forEach(employee -> {
			EmployeeDTO eDTO = new EmployeeDTO();
			 eDTO.setId(employee.getId());
			 eDTO.setFirstName(employee.getFirstName());
			 eDTO.setLastName(employee.getLastName());
			 eDTO.setEmailAddress(employee.getEmailAddress());
			 eDTO.setJoiningDate(employee.getJoiningDate());
			 eDTO.setPhoneNumber(employee.getPhoneNumber());
			 
			 Designation designation = employee.getDesignation();
			 DesignationDTO dDTO = new DesignationDTO();
			 dDTO.setDesignation(designation.getDesignation());
			 
			 City city = employee.getCity();
			 CityDTO cDTO = new CityDTO();
			 cDTO.setCity(city.getCity());
			 
//			 is this right?
			 eDTO.setDesignationDTO(dDTO);
			 eDTO.setCityDTO(cDTO);
			 eDTOs.add(eDTO);
		});
		
		return eDTOs;
	}
	
	
	@Override
	public Integer addEmployee(EmployeeDTO employeeDTO) throws EmplNotFoundException {
		
		Employee employee = new Employee();
		employee.setFirstName(employeeDTO.getFirstName());
		employee.setLastName(employeeDTO.getLastName());
		employee.setJoiningDate(employeeDTO.getJoiningDate());
		employee.setEmailAddress(employeeDTO.getEmailAddress());
		employee.setPhoneNumber(employeeDTO.getPicture());
		Designation designation = new Designation();
		employee.setDesignation(designation);
		
		
		Employee newEmpl = employeeRepository.save(employee);
		
		return newEmpl.getId();
	}
	
	

	@Override
	public void updateEmployee(Integer id, EmployeeDTO employeeDTO) throws EmplNotFoundException {
		// TODO Auto-generated method stub
		
	}

}
