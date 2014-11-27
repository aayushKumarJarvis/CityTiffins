package com.project.city.bo.impl;

import com.project.city.bo.AdminBO;
import com.project.city.dao.AdminDao;
import com.project.city.util.TiffinCenterUtil;

public class AdminBOImpl implements AdminBO{
	
	AdminDao adminDao;
	
	public AdminDao getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	public int userExist(String username, String password) {
		String savedPwd = adminDao.exist(username);
		if(savedPwd == null){
			return TiffinCenterUtil.USER_NAME_DOESNT_EXIST;
		} else if(!password.equals(savedPwd)){
			return TiffinCenterUtil.USER_NAME_PWD_DOESNT_MATCH;
		} else {
			return TiffinCenterUtil.ADMIN_LOGIN_SUCCESS;
		}
	}
}
