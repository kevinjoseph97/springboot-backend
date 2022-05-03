package com.infy.springbootbackend.DTO;

import java.time.LocalDate;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import com.infy.springbootbackend.model.City;
import com.infy.springbootbackend.model.Designation;

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
	
	private Designation designation;
	
	private String picture;
	
	private City city;

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

	public Designation getDesignation() {
		return designation;
	}

	public void setDesignation(Designation designation) {
		this.designation = designation;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
	
	
	
}