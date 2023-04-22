package com.cardb.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cardb.demo.Model.Cardetails;

public interface DbRepo extends JpaRepository<Cardetails,Integer>{

}
