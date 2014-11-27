package com.project.city.dao;

import java.util.List;

import com.project.city.model.ImageData;

public interface ImageDao {
	
	public void addImage(long tiffinCenterId, ImageData imageData);
	public void deleteImage(long imageId);
	public List<ImageData> getImages(long tiffinCenterId);

}
