package com.infy.springbootbackend.DTO;

import com.infy.springbootbackend.model.City;

public class CityDTO {
	
	private Integer id;
	
	private String city;

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
	
	
	public static CityDTO prepareDTO(City city) {
		CityDTO cDTO = new CityDTO();
		cDTO.setId(city.getId());
		cDTO.setCity(city.getCity());
		return cDTO;
	}

}
