package com.project.city.dao;

import com.project.city.model.Review;

public interface ReviewDao {

	public void addReview(Review review);
	public void editReview(long reviewId, String Review);
	public void delteReview(long reviewId);
	public void setVisibility(int isVisible);
}
