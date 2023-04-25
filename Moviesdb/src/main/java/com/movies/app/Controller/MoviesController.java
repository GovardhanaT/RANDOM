package com.movies.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movies.app.Movies.Moviesdb;

@RestController
public class MoviesController {
	@Autowired
	public Moviesdb mo;
	@PostMapping("/moviePost")
	public  Moviesdb addDetails(@RequestBody Moviesdb mov)
	{
		return mo.saveInfo(mov);
		}
	@GetMapping("/moviesGet")
	public List<Moviesdb> getDetails()
{
		return mo.getinfo();
	}
	@PutMapping("/MoviesUpdate")public Moviesdb update(@RequestBody Moviesdb moe)
	{
		return mo.updateinfo(moe);
	}
	@DeleteMapping("/deleteMov/{id}")
	public String deleteMovies(@PathVariable("id") int mid)
	{
		mo.deleteinfo(mid);
		return "deleted";
	}
}
