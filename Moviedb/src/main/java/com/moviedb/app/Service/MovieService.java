package com.moviedb.app.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviedb.app.Model.Movies;
import com.moviedb.app.Repository.MovieRepo;

@Service
public class MovieService {
	@Autowired
	public MovieRepo mr;
	public Movies saveInfo(Movies mo) {
		return mr.save(mo);
	}
	

}
