package com.moviedb.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moviedb.app.Model.Movies;

public interface MovieRepo extends JpaRepository<Movies, Integer>{

}
