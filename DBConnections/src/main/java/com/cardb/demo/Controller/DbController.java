package com.cardb.demo.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cardb.demo.Model.Cardetails;
import com.cardb.demo.Repository.CarRepo;
import com.cardb.demo.Service.DbService;

@RestController
public class DbController 
{
	@Autowired
	public DbService se;
	
	@PostMapping("/CarPost")
	public Cardetails addDetails(@RequestBody Cardetails car)
	{
		return se.saveInfo(car);
	}
	@GetMapping("/Carget")
	
	public List<Cardetails> getDetails()
	{
		return se.getinfo();
	}
	
	@PutMapping("/Carupdate")
	
	public Cardetails update(@RequestBody Cardetails ID)
	{
		return se.updateinfo(ID);
	}
	
	@DeleteMapping("/deletecar/{id}")
	
	public String deleteCars(@PathVariable("id") int cid)
	{
		se.deleteinfo(cid);
		return "deleted";
	}
	
	@DeleteMapping("/deleteByreq")
	public String deleteByRequestPara(@RequestParam ("id") int carid) 
	{
		se.deleteinfo(carid);
		return carid+" is  deleted";
	}
	
	//sort by descending order 
	@GetMapping("/sortDesc/{name}")
	public List<Cardetails> sortCar(@PathVariable("name") String name)
	{
		return se.sortDesc(name);
	}
	//pagination
	@GetMapping("/pagination/{pnum}/{psize}")
	public List<Cardetails> paginationData(@PathVariable("pnum") int pnum,@PathVariable("psize") int psize)
	{
		return se.paginationData(pnum,psize);
	}  
	@GetMapping("/paginationandSorting/{pnum}/{psize}/{pname}")
	public List<Cardetails> paginationandSorting(@PathVariable("pnum") int pnum,@PathVariable("psize") int psize,@PathVariable("pname") String pname)
    {
	return se.paginationandSorting(pnum,psize,pname);
       }
	
//	@Autowired
	//public CarRepo res;
	/*
	@GetMapping("getD")
	public List <Cardetails> getD()

	{
		return res.getAllData();
	}
	@GetMapping("byName/{id}")
	public List<Cardetails> getName(@PathVariable ("id") int carid)
	{
		return res.byCarName(carid);
	}
	
	@GetMapping("/startEnd/{start}/{end}")
	public List<Cardetails> startEnds(@PathVariable ("start") int start,@PathVariable("end") int end)
	{
		return res.startEnd(start,end);
	}*/
	
	
}
