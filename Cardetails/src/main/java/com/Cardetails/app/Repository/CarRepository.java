package com.Cardetails.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Cardetails.app.Model.Cardetails;

public interface CarRepository extends JpaRepository<Cardetails, Integer> {

}
