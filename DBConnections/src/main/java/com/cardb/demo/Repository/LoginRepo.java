package com.cardb.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cardb.demo.Model.Login;


@Repository
public interface LoginRepo extends JpaRepository<Login,Integer>{
	
	Login findByUsername(String username);

}
