package com.project.city.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hits_per_tiffin_center")
public class HitsPerTiffinCenter {
	
	private long id;
	private long tiffinCenterId;
	private String location;
	private long numberOfHits;
	
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
	
	@Column(name="location")
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Column(name="number_of_hits", nullable=false)
	public long getNumberOfHits() {
		return numberOfHits;
	}
	public void setNumberOfHits(long numberOfHits) {
		this.numberOfHits = numberOfHits;
	}
}
