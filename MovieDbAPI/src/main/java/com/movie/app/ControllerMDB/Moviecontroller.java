package com.movie.app.ControllerMDB;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.movie.app.ModelMDB.MovieDetails;
import com.movie.app.RepositoryMDB.Movierepo;
import com.movie.app.ServiceMDB.Movieservice;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class Moviecontroller {
	@Autowired
	Movieservice ms;
	
	
	@PostMapping("/postDetails")
	public MovieDetails DbSave(@RequestBody MovieDetails mds) {
		return ms.addDetails(mds);
	}
	
	
	@GetMapping("/getData")
	public List<MovieDetails> Dbreturn()
	{
	return ms.returnInfo();
	}
	
	@Autowired
	Movierepo mr;
	//NAtiveQuery
	@Tag(name="Native Query",description = "Getting Details")
	@GetMapping("/getByNative")
	public List<MovieDetails> getNative(){
		return mr.getAllData();
	}
	
	@Tag(name="Native Query",description = "Deleting Details by id")
	@DeleteMapping("deleteNative/{mid}")
	public String deleteNative(@PathVariable("mid") int mid)
	{
		mr.deleteById(mid);
		return "Deleted By NativeQuery";
	}
	
	@Tag(name="Native Query",description = "Updating details")
	@PutMapping("updateNative/{mid}/{mtitle}")
	public String updateQuery(@PathVariable("mid") int mid,@PathVariable("mtitle") String mtitle)
	{
		mr.updateByQuery(mid,mtitle);
		return "updated Suucessfully";
		
	}
	
	@Tag(name="jpql",description = "get Details by director")
	@GetMapping("/jpql/{director}")
	public List<MovieDetails> updatejpql(@PathVariable("director") String director){
		return mr.getByDirector(director);
	}
	//jpql
	
	
	/*@Autowired
	Movieservice msv;
	@GetMapping("/getBbyDirector")
	public List<MovieDetails> getByDirector(@PathVariable String director)
	{
		return msv.getBYDirector(director);
	}
	
	
	@PostMapping("/saveAll")
	public MovieDetails saveAll(@RequestBody MovieDetails d)
	{
		return mr.save(d);
	}
	@PutMapping("/update/{id}/{title}")
	public void update(@PathVariable("id") int id,@PathVariable("title") String title)
	{
		mr.updateByQuery(id, title);
	}
	
	@DeleteMapping("/deletebyname/{title}")
	public String deleteByTitle(String title)
	{
		
	}
	
	@PutMapping("/updateByRuntime/{runTime}")
	public String updateByrunTime(@PathVariable int id,@PathVariable int runTime)
	{
		int result=msv.updateByrunTime(id,runTime);
		if(result>0)
			return "runTime rec updated";
		else
			return "Problem occured during updation";
		
	}*/
}
	
	
	
