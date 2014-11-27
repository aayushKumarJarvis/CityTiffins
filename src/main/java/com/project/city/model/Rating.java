package com.project.city.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rating")
public class Rating {

	private long id;
	private long userId;
	private long tiffinCenterId;
	private int hygeneRating;
	private int tasteRating;
	
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
	
	@Column(name="hygene_rating")
	public int getHygeneRating() {
		return hygeneRating;
	}
	public void setHygeneRating(int hygeneRating) {
		this.hygeneRating = hygeneRating;
	}
	
	@Column(name="taste_rating")
	public int getTasteRating() {
		return tasteRating;
	}
	public void setTasteRating(int tasteRating) {
		this.tasteRating = tasteRating;
	}
}
