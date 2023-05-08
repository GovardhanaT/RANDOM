package com.movie.app.RepositoryMDB;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.movie.app.ModelMDB.MovieDetails;
import com.movie.app.ServiceMDB.Movieservice;

import jakarta.transaction.Transactional;
@Repository
public interface Movierepo extends JpaRepository<MovieDetails, Integer>
{
	
	
@Modifying
@Transactional
@Query(value="select * from movie_details",nativeQuery = true)
public List<MovieDetails> getAllData();

@Modifying
@Transactional
@Query(value="delete from movie_details where id=?1  and id=?2",nativeQuery = true)
public void deleteById(@Param("mid") int mid,@Param("mtitle") String mtitle);

@Modifying
@Transactional
@Query(value="update movie_details set id=?1 where  title=?2",nativeQuery = true)
public void updateByQuery(@Param("mid") int mid,@Param("mtitle") String mtitle);

//named
@Modifying
@Transactional
@Query("select d from MovieDetails d where d.director=?1")
public List<MovieDetails> getByDirector(@Param("director") String director);


/*@Modifying
@Transactional
@Query("delete from MovieDetails d where d.title=?1")
public void deleteByTitle( @Param("title") String title);


@Modifying
@Transactional
@Query("update MovieDetails d set d.id=?1 where d.runTime=?2" )
public void  updateByrunTime(@Param("id") int id,@Param("runTime") int runTime);*/



}






