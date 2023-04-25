package com.cardb.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cardb.demo.Model.Cardetails;
import com.cardb.demo.Repository.CarRepo;
@Service
public class DbService {
	@Autowired
	public CarRepo re;
	public Cardetails saveInfo(Cardetails c)
	{
		return re.save(c);
	}
	
	public List<Cardetails> getinfo()

	{
		return re.findAll();
	}
	public Cardetails updateinfo(Cardetails cu)
	{
		return re.saveAndFlush(cu);
	}
	public void deleteinfo(int cid)
	{
		re.deleteById(cid);
	}

}
