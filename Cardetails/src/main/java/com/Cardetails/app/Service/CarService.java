package com.Cardetails.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.Cardetails.app.Model.Cardetails;
import com.Cardetails.app.Repository.CarRepository;



public class CarService {
	@Autowired
	public CarRepository re;
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
