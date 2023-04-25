package com.moviedb.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.moviedb.app.Model.Movies;
import com.moviedb.app.Service.MovieService;

@RestController
public class MovieController {
	@Autowired
	public MovieService se;
	@PostMapping("/saveMovies")
	public Movies addDetails(@RequestBody Movies mv)
	{
	return se.saveInfo(mv);	
	}
	

}
