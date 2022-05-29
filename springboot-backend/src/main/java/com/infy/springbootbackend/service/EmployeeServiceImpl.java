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
			new EmplNotFoundException("EMPLOYEE NOT FOUND"));
		
		EmployeeDTO eDTO = EmployeeDTO.prepareDTO(employee);
		DesignationDTO dDTO = DesignationDTO.prepareDTO(employee.getDesignation());
		CityDTO cDTO = CityDTO.prepareDTO(employee.getCity());
		eDTO.setDesignation(dDTO);
		eDTO.setCity(cDTO);
		
		
		return eDTO;
	}
	
	
	
	

	@Override
	public List<EmployeeDTO> getAllEmployees() throws EmplNotFoundException {
		
		Iterable<Employee> employees = employeeRepository.findAll();
		List<EmployeeDTO> eDTOs = new ArrayList<>();
		
		employees.forEach(e -> {
			EmployeeDTO eDTO = EmployeeDTO.prepareDTO(e);
			DesignationDTO dDTO = DesignationDTO.prepareDTO(e.getDesignation());
			CityDTO cDTO = CityDTO.prepareDTO(e.getCity());
			eDTO.setDesignation(dDTO);
			eDTO.setCity(cDTO);
			eDTOs.add(eDTO);
		});
		
		if (eDTOs.isEmpty()) {
			throw new EmplNotFoundException("NO Employees Fetched");
		}
		
		return eDTOs;
		
		
	}
	
	
	
	@Override
	public Integer addEmployee(EmployeeDTO employeeDTO) throws EmplNotFoundException {
		
		Employee employee = EmployeeDTO.prepareEntity(employeeDTO);
		Optional<City> optCity = cityRepository.findById(employeeDTO.getCity().getId());
		City city = optCity.orElseThrow(()-> 
				 new EmplNotFoundException("No City Found"));
		
		Optional<Designation> optDesig = designationRepository.findById(employeeDTO.getDesignation().getId());
		Designation designation = optDesig.orElseThrow(()-> 
				new EmplNotFoundException("No Designation found"));
		
		
		employee.setDesignation(designation);
		employee.setCity(city);
		
		Employee emplFromDb = employeeRepository.save(employee);
		return emplFromDb.getId();
		
	}
	
	

	@Override
	public void updateEmployee(Integer id, EmployeeDTO employeeDTO) throws EmplNotFoundException {
		
		
		Optional<Employee> optionalEmp = employeeRepository.findById(employeeDTO.getId());
		Employee employee = optionalEmp.orElseThrow(() -> 
				new EmplNotFoundException("Employee not Found"));
		
		employee.setFirstName(employeeDTO.getFirstName());
		
		employee.setLastName(employeeDTO.getLastName());
		employee.setJoiningDate(employeeDTO.getJoiningDate());
		employee.setEmailAddress(employeeDTO.getEmailAddress());
		employee.setPhoneNumber(employeeDTO.getPhoneNumber());
		
		Optional<City> optionalCity = cityRepository.findById(employeeDTO.getCity().getId());
		City city = optionalCity.orElseThrow(() -> new EmplNotFoundException("No City Found"));
		
		Optional<Designation> optDesig = designationRepository.findById(employeeDTO.getDesignation().getId());
		Designation designation = optDesig.orElseThrow(()-> 
				new EmplNotFoundException("No Designation found"));
		
		employee.setDesignation(designation);
		employee.setCity(city);
		
		employee = employeeRepository.save(employee);
		DesignationDTO dDTO = DesignationDTO.prepareDTO(designation);
		CityDTO cDTO = CityDTO.prepareDTO(city);
		
		employeeDTO.setDesignation(dDTO);
		employeeDTO.setCity(cDTO);
 		

		
//		Designation designation = employee.getDesignation();
//		DesignationDTO dDTO = new DesignationDTO();
//		dDTO.setDesignation(designation.getDesignation());
//		
//		
//		City city = employee.getCity();
//		CityDTO cDTO = new CityDTO();
//		cDTO.setCity(city.getCity());
//		
//		employeeDTO.setDesignation(dDTO);
//		employeeDTO.setCity(cDTO);
	
	}
	
	
	
	
	@Override
	public List<String> getDesignations() throws EmplNotFoundException {
		Iterable<Designation> designations = designationRepository.findAll();
		List<String> desigNames = new ArrayList<>();
		for (Designation desig: designations) {
			desigNames.add(desig.getDesignation());
		}
		return desigNames;
	}
	
	
	@Override
	public List<String> getCitys() throws EmplNotFoundException {
		
		Iterable<City> cities = cityRepository.findAll();
		List<String> cityNames = new ArrayList<>();
		for ( City city: cities) {
			cityNames.add(city.getCity());
		}
		
		return cityNames;
	}
	
	
	

}
