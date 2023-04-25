package com.moviedb.app.Model;

import jakarta.persistence.Entity;

@Entity
public class Movies {
	
	@id
	private String Mname;
	private String relDate;
	private String time;
	private String castStrength;
	private int rating;
	public String getMname() {
		return Mname;
	}
	public void setMname(String mname) {
		Mname = mname;
	}
	public String getRelDate() {
		return relDate;
	}
	public void setRelDate(String relDate) {
		this.relDate = relDate;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getCastStrength() {
		return castStrength;
	}
	public void setCastStrength(String castStrength) {
		this.castStrength = castStrength;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getActress() {
		return actress;
	}
	public void setActress(String actress) {
		this.actress = actress;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	private String actor;
	private String actress;
	private String about;
	

}
