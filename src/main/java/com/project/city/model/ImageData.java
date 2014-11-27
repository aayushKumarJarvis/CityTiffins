package com.project.city.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="image_data")
public class ImageData {

	private long id;
	private long tiffinCenterId;
	private String imageData;
	private int visible;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique=true, nullable=false)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name="tiffin_center_id", nullable=false)
	public long getTiffinCenterId() {
		return tiffinCenterId;
	}
	public void setTiffinCenterId(long tiffinCenterId) {
		this.tiffinCenterId = tiffinCenterId;
	}
	
	@Column(name="image_data", nullable=false)
	public String getImageData() {
		return imageData;
	}
	public void setImageData(String imageData) {
		this.imageData = imageData;
	}
	
	@Column(name="visible", nullable=false)
	public int getVisible() {
		return visible;
	}
	public void setVisible(int visible) {
		this.visible = visible;
	}
	
	
}
