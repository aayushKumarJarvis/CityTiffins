package com.project.city.bo;

import java.util.List;

import com.project.city.model.TiffinCenterData;

public interface TiffinCenterBO {

	public void saveNewTiffinCenter(TiffinCenterData tiffinCenter);
	public void deleteTiffinCenter(long tiffinCenterId);
	public void editTiffinCenter(TiffinCenterData tiffinCenter);
	/*public TiffinCenter getTiffinCenter(long tiffinCenterId);
	public void setRating(int hygeneRating, int tasteRating);
	public void setTotalReviews();*/
	
	public List<TiffinCenterData> getAllTiffinCenters(String city);
	public List<TiffinCenterData> getAllTiffinCenters(String city, String location);
	
	/*public void saveMealTypeData(TiffinCenterTiffinTypeMapping tiffinType);
	public boolean deleteMealTypeData(long tiffinCenterId);
	public void editMealTypeData(long tiffinCenterId, TiffinCenterTiffinTypeMapping tiffinType);
	public TiffinCenterTiffinTypeMapping getMealTypeData(long tiffinCenterId);
	
	public void setNoOfHits(long tiffinCenterId, String location);
	public long getNumberOfHits(long tiffinCenterId);
	public long getNumberOfHits(long tiffinCenterId, String location);*/
}
