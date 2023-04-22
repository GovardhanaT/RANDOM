package com.cardb.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cardb.demo.Model.Cardetails;
import com.cardb.demo.Service.DbService;

@RestController
public class DbController {
	@Autowired
	public DbService se;
	@PostMapping("/saveCardetails")
	public Cardetails addDetails(@RequestBody Cardetails car)
	{
		return se.saveInfo(car);
	}

}
