package com.infy.springbootbackend.model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.lang.NonNull;

@Entity
@Table(name="employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	@Column(name="first_name")
	@NotNull(message = "Can not be empty")
	private String firstName;
	
	
	@Column(name = "last_name")
	@NotNull(message = "Can not be empty")
	private String lastName;

	
	@Column(name = "joining_date" )
	private LocalDate joingDate;
	
	@Column(name ="email_address" )
	@NotNull(message = "Can not be empty")
	private String emailAddress;
	
	@Column(name = "phone_number")
	@NotNull(message = "Can not be empty")
	@Pattern(regexp = ("^[0-9]{10}$"))
	private String phoneNumber;
	
	@Column(name = "designatoin")
	private String designation;
	
	@Column(name = "location_city")
	private  String locationCity;
	
	@Column(length = 64)
	private String picture;
	
	
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, LocalDate joingDate, String emailAddress, String phoneNumber,
			String designation, String locationCity, String picture) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.joingDate = joingDate;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.designation = designation;
		this.locationCity = locationCity;
		this.picture = picture;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public LocalDate getJoingDate() {
		return joingDate;
	}

	public void setJoingDate(LocalDate joingDate) {
		this.joingDate = joingDate;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getLocationCity() {
		return locationCity;
	}

	public void setLocationCity(String locationCity) {
		this.locationCity = locationCity;
	}
	
	
	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", joingDate=" + joingDate
				+ ", emailAddress=" + emailAddress + ", phoneNumber=" + phoneNumber + ", designation=" + designation
				+ ", locationCity=" + locationCity + ", picture=" + picture + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
//	public Employee() {
//		
//	}
//
//
//
//	public Employee(String firstName, String lastName) {
//		super();
//		this.firstName = firstName;
//		this.lastName = lastName;
//	}
//
//
//
//	public long getId() {
//		return id;
//	}
//
//
//
//	public void setId(long id) {
//		this.id = id;
//	}
//
//
//
//	public String getFirstName() {
//		return firstName;
//	}
//
//
//
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//
//
//
//	public String getLastName() {
//		return lastName;
//	}
//
//
//
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//
//
//
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
//	}
//	
//	
	
	
}
