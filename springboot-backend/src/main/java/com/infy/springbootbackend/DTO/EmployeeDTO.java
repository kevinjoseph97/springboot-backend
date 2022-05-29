package com.infy.springbootbackend.DTO;

import java.time.LocalDate;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import com.infy.springbootbackend.model.City;
import com.infy.springbootbackend.model.Designation;
import com.infy.springbootbackend.model.Employee;

public class EmployeeDTO {
	
	private Integer id;
	
	@NotNull(message = "Please enter a name")
	private String firstName;
	
	
	@NotNull(message = "Please enter a name")
	private String lastName;
	
	private LocalDate joiningDate;
	
	@NotNull(message = "Can not be empty")
	@Email(message = "Please enter a valid Email")
	private String emailAddress;
	
	@NotNull(message = "Can not be empty")
	@Pattern(regexp = ("^[0-9]{10}$"))
	private String phoneNumber;
	
	private DesignationDTO designation;
	
	private String picture;
	
	private CityDTO city;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	public DesignationDTO getDesignation() {
		return designation;
	}

	public void setDesignation(DesignationDTO designation) {
		this.designation = designation;
	}
	
	public CityDTO getCity() {
		return city;
	}

	public void setCity(CityDTO city) {
		this.city = city;
	}

	
	
	public static EmployeeDTO prepareDTO(Employee employee) {
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setId(employee.getId());
		employeeDTO.setFirstName(employee.getFirstName());
		employeeDTO.setLastName(employee.getLastName());
		employeeDTO.setJoiningDate(employee.getJoiningDate());
		employeeDTO.setEmailAddress(employee.getEmailAddress());
		employeeDTO.setPhoneNumber(employee.getPhoneNumber());
		employeeDTO.setPicture(employee.getPicture());
		return employeeDTO;
		}
	
	
	public static Employee prepareEntity(EmployeeDTO eDTO) {
		Employee e = new Employee();
		e.setId(eDTO.getId());
		e.setFirstName(eDTO.getFirstName());
		e.setLastName(eDTO.getLastName());
		e.setJoiningDate(eDTO.getJoiningDate());
		e.setEmailAddress(eDTO.getEmailAddress());
		e.setPhoneNumber(eDTO.getPhoneNumber());
		e.setPicture(eDTO.getPicture());
		return e;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", joiningDate="
				+ joiningDate + ", emailAddress=" + emailAddress + ", phoneNumber=" + phoneNumber + ", designation="
				+ designation + ", picture=" + picture + ", city=" + city + "]";
	}


	
	
	
	
	
	
	
	
	
}