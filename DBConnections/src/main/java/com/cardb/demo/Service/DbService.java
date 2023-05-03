package com.cardb.demo.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.cardb.demo.Model.Cardetails;
import com.cardb.demo.Model.Login;
import com.cardb.demo.Repository.CarRepo;
import com.cardb.demo.Repository.LoginRepo;
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
	//sorting
	public List<Cardetails> sortDesc(String name)
	{
		return re.findAll(Sort.by(name).descending());
	}
	//pagination
		public List<Cardetails> paginationData(int pnum,int psize)
		{
		 Page<Cardetails> c=re.findAll(PageRequest.of(pnum, psize));
		 return c.getContent();
		}
		//pagination and sorting
		public List<Cardetails> paginationandSorting(int pnum,int psize,String pname)
		{
		    Page<Cardetails> pe=re.findAll(PageRequest.of(pnum, psize, Sort.by(pname).descending()));
		    		return pe.getContent();
		}
		
}
		
