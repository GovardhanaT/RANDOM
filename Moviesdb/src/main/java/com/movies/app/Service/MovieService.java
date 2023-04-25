package com.movies.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movies.app.Movies.Moviesdb;
import com.movies.app.Repository.MovieRepo;
@Service

public class MovieService {
@Autowired
public MovieRepo re;
public Moviesdb saveInfo(Moviesdb m)
{
	return re.save(m);
}
	public List<Moviesdb> getinfo()
       {
		return re.findAll();
		}
	public Moviesdb updateinfo(Moviesdb mv)
	{
		return re.saveAndFlush(mv);
	}
	public void deleteinfo(int mid)
	{
		re.deleteById(mid);
	}
}

