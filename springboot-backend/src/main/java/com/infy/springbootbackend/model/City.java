package com.infy.springbootbackend.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table(name ="city")
public class City {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "city_id")
	private Integer id;
	
	@Column(name = "location_city")
	private String city;	
	
	
	
//	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	private Employee employee;
	
	
	public City() {
		
	}
	
	
	public City(String city) {
		super();
		this.city = city;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}


//	public Employee getEmployee() {
//		return employee;
//	}
//
//
//	public void setEmployee(Employee employee) {
//		this.employee = employee;
//	}


	@Override
	public String toString() {
		return "City [id=" + id + ", city=" + city + "]";
	}
	
	
	
	
	
	
	

}
