package com.example.demo.ex1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Exercise1 
{
@RequestMapping("/welcome")
@ResponseBody
public String d1e1()
{
	return "welcome to RESTAPI ";
}
}
