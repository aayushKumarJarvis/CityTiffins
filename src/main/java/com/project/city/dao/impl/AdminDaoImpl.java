package com.project.city.dao.impl;

import java.util.List;

import com.project.city.dao.AdminDao;
import com.project.city.model.Admin;
import com.project.city.util.CustomHibernateDAOSupport;

public class AdminDaoImpl extends CustomHibernateDAOSupport implements AdminDao{

	public String exist(String username) {
		List usernameList = getHibernateTemplate().find("from Admin where userId = ?", username);
		if(usernameList.isEmpty())
			return null;
		else
			return ((Admin)usernameList.get(0)).getPassword();
	}
}