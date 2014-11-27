package com.project.city.dao;

import com.project.city.model.User;

public interface UserDao {
	
	public void saveUser(User user);
	public void editUser(long id, User user);

}
