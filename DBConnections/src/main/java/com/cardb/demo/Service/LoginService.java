
package com.cardb.demo.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cardb.demo.Model.Login;
import com.cardb.demo.Repository.LoginRepo;



@Service
public class LoginService {
	@Autowired
	LoginRepo userRepo;

public String validateUser(String username,String password)
{
	String result="";
	Login u=userRepo.findByUsername(username);
	if(u==null)
	{
		result="Invalid user";
	}
		else
		{
			if(u.getPassword().equals(password))
			{
				result="Login success";
			}
			else
			{
				result="Login failed";
			}
		}
	

	return result;
	}
	
	
	}
