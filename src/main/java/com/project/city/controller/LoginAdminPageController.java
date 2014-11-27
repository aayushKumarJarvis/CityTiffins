package com.project.city.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.city.bo.AdminBO;

/**
 * 
 * @author amitmitra
 *
 */
/*
 */

@Controller
@RequestMapping("/adminlogin")
public class LoginAdminPageController {

	@Autowired
	AdminBO adminBo;
	private final Logger log = Logger.getLogger(this.getClass());
	
	/**
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping(value="/{username}/{password}", method = RequestMethod.GET)
	@ResponseBody
	public long getAdminDetail(@PathVariable("username") String username, 
			@PathVariable("password") String password){
		return adminBo.userExist(username, password);
	}
}
