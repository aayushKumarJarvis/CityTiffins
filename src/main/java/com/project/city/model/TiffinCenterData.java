package com.project.city.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tiffin_center_data")
public class TiffinCenterData {

	private long id;
	private String name;
	private String city;
	private String location;
	private String address;
	private String coordinates;
	private String cuisines;
	private String speciality;
	private String working_days;
	private String lunch_timing;
	private String dinner_timing;
	private String whole_timing;
	private String contacts_nos;
	private String lnivi;
	private String lnivp;
	private String lninvi;
	private String lninvp;
	private String lsivi;
	private String lsivp;
	private String lsinvi;
	private String lsinvp;
	private String dnivi;
	private String dnivp;
	private String dninvi;
	private String dninvp;
	private String dsivi;
	private String dsivp;
	private String dsinvi;
	private String dsinvp;
	private long totalHygeneRating;
	private long totalTasteRating;
	private long totalVotes;
	
	@Id
	@Column(name="id", unique=true, nullable=false)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name="name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Column(name="city")
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Column(name="location")
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Column(name="address")
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name="coordinates")
	public String getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}
	
	@Column(name="cuisines")
	public String getCuisines() {
		return cuisines;
	}
	public void setCuisines(String cuisines) {
		this.cuisines = cuisines;
	}
	
	@Column(name="speciality")
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	@Column(name="working_days")
	public String getWorking_days() {
		return working_days;
	}
	public void setWorking_days(String working_days) {
		this.working_days = working_days;
	}
	
	@Column(name="lunch_timing")
	public String getLunch_timing() {
		return lunch_timing;
	}
	public void setLunch_timing(String lunch_timing) {
		this.lunch_timing = lunch_timing;
	}
	
	@Column(name="dinner_timing")
	public String getDinner_timing() {
		return dinner_timing;
	}
	public void setDinner_timing(String dinner_timing) {
		this.dinner_timing = dinner_timing;
	}
	
	@Column(name="whole_timing")
	public String getWhole_timing() {
		return whole_timing;
	}
	public void setWhole_timing(String whole_timing) {
		this.whole_timing = whole_timing;
	}
	
	@Column(name="contact_nos")
	public String getContacts_nos() {
		return contacts_nos;
	}
	public void setContacts_nos(String contacts_nos) {
		this.contacts_nos = contacts_nos;
	}
	
	@Column(name="lnivi")
	public String getLnivi() {
		return lnivi;
	}
	public void setLnivi(String lnivi) {
		this.lnivi = lnivi;
	}
	
	@Column(name="lnivp")
	public String getLnivp() {
		return lnivp;
	}
	public void setLnivp(String lnivp) {
		this.lnivp = lnivp;
	}
	
	@Column(name="lninvi")
	public String getLninvi() {
		return lninvi;
	}
	public void setLninvi(String lninvi) {
		this.lninvi = lninvi;
	}
	
	@Column(name="lninvp")
	public String getLninvp() {
		return lninvp;
	}
	public void setLninvp(String lninvp) {
		this.lninvp = lninvp;
	}
	
	@Column(name="lsivi")
	public String getLsivi() {
		return lsivi;
	}
	public void setLsivi(String lsivi) {
		this.lsivi = lsivi;
	}
	
	@Column(name="lsivp")
	public String getLsivp() {
		return lsivp;
	}
	public void setLsivp(String lsivp) {
		this.lsivp = lsivp;
	}
	
	@Column(name="lsinvi")
	public String getLsinvi() {
		return lsinvi;
	}
	public void setLsinvi(String lsinvi) {
		this.lsinvi = lsinvi;
	}
	
	@Column(name="lsinvp")
	public String getLsinvp() {
		return lsinvp;
	}
	public void setLsinvp(String lsinvp) {
		this.lsinvp = lsinvp;
	}
	
	@Column(name="dnivi")
	public String getDnivi() {
		return dnivi;
	}
	public void setDnivi(String dnivi) {
		this.dnivi = dnivi;
	}
	
	@Column(name="dnivp")
	public String getDnivp() {
		return dnivp;
	}
	public void setDnivp(String dnivp) {
		this.dnivp = dnivp;
	}
	
	@Column(name="dninvi")
	public String getDninvi() {
		return dninvi;
	}
	public void setDninvi(String dninvi) {
		this.dninvi = dninvi;
	}
	
	@Column(name="dninvp")
	public String getDninvp() {
		return dninvp;
	}
	public void setDninvp(String dninvp) {
		this.dninvp = dninvp;
	}
	
	@Column(name="dsivi")
	public String getDsivi() {
		return dsivi;
	}
	public void setDsivi(String dsivi) {
		this.dsivi = dsivi;
	}
	
	@Column(name="dsivp")
	public String getDsivp() {
		return dsivp;
	}
	public void setDsivp(String dsivp) {
		this.dsivp = dsivp;
	}
	
	@Column(name="dsinvi")
	public String getDsinvi() {
		return dsinvi;
	}
	public void setDsinvi(String dsinvi) {
		this.dsinvi = dsinvi;
	}
	
	@Column(name="dsinvp")
	public String getDsinvp() {
		return dsinvp;
	}
	public void setDsinvp(String dsinvp) {
		this.dsinvp = dsinvp;
	}
	
	@Column(name="total_hygene_rating")
	public long getTotalHygeneRating() {
		return totalHygeneRating;
	}
	public void setTotalHygeneRating(long totalHygeneRating) {
		this.totalHygeneRating = totalHygeneRating;
	}
	
	@Column(name="total_taste_rating")
	public long getTotalTasteRating() {
		return totalTasteRating;
	}
	public void setTotalTasteRating(long totalTasteRating) {
		this.totalTasteRating = totalTasteRating;
	}
	
	@Column(name="total_votes")
	public long getTotalVotes() {
		return totalVotes;
	}
	public void setTotalVotes(long totalVotes) {
		this.totalVotes = totalVotes;
	}
}
