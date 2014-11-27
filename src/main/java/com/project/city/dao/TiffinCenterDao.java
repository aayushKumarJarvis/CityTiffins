package com.project.city.dao;

import java.util.List;

import com.project.city.model.TiffinCenterData;

public interface TiffinCenterDao {
	
	public void saveNewTiffinCenter(TiffinCenterData tiffinCenter);
	public void deleteTiffinCenter(long tiffinCenterId);
	public void editTiffinCenter(TiffinCenterData tiffinCenter);
	public TiffinCenterData getTiffinCenter(long tiffinCenterId);
	
	public List<TiffinCenterData> getAllTiffinCenters();
	public List<TiffinCenterData> getAllTiffinCenters(String city);
	public List<TiffinCenterData> getAllTiffinCenters(String city, String location);
	
	public void setNoOfHits(long tiffinCenterId, String location);
	public long getNumberOfHits(long tiffinCenterId);
	public long getNumberOfHits(long tiffinCenterId, String location);
	
}
