package com.movie.app.RepositoryMDB;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movie.app.ModelMDB.ReleaseDetails;
@Repository
public interface TitleRepo extends JpaRepository<ReleaseDetails, Integer>{

}
