package com.movies.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movies.app.Movies.Moviesdb;

public interface MovieRepo  extends JpaRepository<Moviesdb, Integer>{

}
