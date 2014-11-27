package com.project.city.dao;

import com.project.city.model.Rating;

public interface RatingDao {
	
	public void setRating(Rating ratingData);
	public void editRating(long ratingId, int hygeneRating, int tasteRating);
	public void getRating(long userId, long tiffinCenterId);

}
