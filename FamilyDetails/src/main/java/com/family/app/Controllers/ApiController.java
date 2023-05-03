package com.family.app.Controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.family.app.Models.Family;

@Controller
public class ApiController {
	@GetMapping("/FamilyGet")
	public List<Family> getDetails(@RequestBody Family fam)
	{
		return ;
	}
	

}
