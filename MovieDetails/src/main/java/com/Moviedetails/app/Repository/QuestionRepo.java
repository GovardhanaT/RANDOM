package com.Moviedetails.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Moviedetails.app.ModelM.QuestionM;

public interface QuestionRepo extends JpaRepository<QuestionM, Integer>{

}
