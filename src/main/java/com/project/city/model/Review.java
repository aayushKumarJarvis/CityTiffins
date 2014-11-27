package com.project.city.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="review")
public class Review {
	
	private long id;
	private long userId;
	private long tiffinCenterId;
	private String review;
	private int isVisible;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique=true, nullable=false)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name="user_id", nullable=false)
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	@Column(name="tiffin_center_id", nullable=false)
	public long getTiffinCenterId() {
		return tiffinCenterId;
	}
	public void setTiffinCenterId(long tiffinCenterId) {
		this.tiffinCenterId = tiffinCenterId;
	}
	
	@Column(name="review", nullable=false)
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	
	@Column(name="visible", nullable=false)
	public int getIsVisible() {
		return isVisible;
	}
	public void setIsVisible(int isVisible) {
		this.isVisible = isVisible;
	}
	
	
}
