package com.movie.app.ServiceMDB;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.movie.app.ModelMDB.MovieDetails;
import com.movie.app.RepositoryMDB.Movierepo;


@Service
public class Movieservice {
	@Autowired
	Movierepo mr;
	public MovieDetails addDetails(@RequestBody MovieDetails md) {
	return mr.save(md);	
	}
	
	public List<MovieDetails> returnInfo(){
		return mr.findAll();
	}
	
	
	
	
	
}
