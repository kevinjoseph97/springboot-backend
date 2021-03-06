package com.infy.springbootbackend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infy.springbootbackend.model.City;


@Repository
public interface CityRepository extends JpaRepository<City, Integer>{

}
