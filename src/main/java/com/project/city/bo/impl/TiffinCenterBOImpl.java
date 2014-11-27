package com.project.city.bo.impl;

import java.util.List;

import com.project.city.bo.TiffinCenterBO;
import com.project.city.dao.TiffinCenterDao;
import com.project.city.model.TiffinCenterData;

public class TiffinCenterBOImpl implements TiffinCenterBO {

	TiffinCenterDao tiffinCenterDao;
	TiffinCenterData tiffinCenter;
	
	public TiffinCenterDao getTiffinCenterDao() {
		return tiffinCenterDao;
	}
	public void setTiffinCenterDao(TiffinCenterDao tiffinCenterDao) {
		this.tiffinCenterDao = tiffinCenterDao;
	}
	public TiffinCenterData getTiffinCenter() {
		return tiffinCenter;
	}
	public void setTiffinCenter(TiffinCenterData tiffinCenter) {
		this.tiffinCenter = tiffinCenter;
	}

	public List<TiffinCenterData> getAllTiffinCenters(String city) {
		return tiffinCenterDao.getAllTiffinCenters(city);
	}

	public List<TiffinCenterData> getAllTiffinCenters(String city, String location) {
		return tiffinCenterDao.getAllTiffinCenters(city, location);
	}

	public void saveNewTiffinCenter(TiffinCenterData tiffinCenter) {
		tiffinCenterDao.saveNewTiffinCenter(tiffinCenter);
	}

	public void deleteTiffinCenter(long tiffinCenterId) {
		tiffinCenterDao.deleteTiffinCenter(tiffinCenterId);
	}

	public void editTiffinCenter(TiffinCenterData tiffinCenter) {
		tiffinCenterDao.editTiffinCenter(tiffinCenter);
	}

}
