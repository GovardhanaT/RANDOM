package com.cardb.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cardb.demo.Model.Cardetails;
import com.cardb.demo.Repository.DbRepo;
@Service
public class DbService {
	@Autowired
	public DbRepo re;
	public Cardetails saveInfo(Cardetails c)
	{
		return re.save(c);
	}
	
	

}
