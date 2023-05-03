package com.Moviedetails.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Moviedetails.app.ModelM.QuestionM;
import com.Moviedetails.app.Repository.QuestionRepo;

@RestController
@RequestMapping("/Question")

public class QuestionController {
	
	@Autowired
	QuestionRepo qreepo;
	
	 @PostMapping("/poost")
	 public String saveDetails(@RequestBody QuestionM q)
	 {
		 qreepo.save(q);
		 return "Data saved";
	 }
	 
	 @GetMapping("")
	 public List<QuestionM> showQA()
	 {
		 return qreepo.findAll();
	 }

}
