package com.movie.app.ModelMDB;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ReleaseDetails {
	@Id
	private int id;
	private int date;
	private String month;
	private int year;
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	

	@Override
	public String toString() {
		return "ReleaseDetails [id=" + id + ", date=" + date + ", month=" + month + ", year=" + year + "]";
	}
}
