package com.cardb.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Cardetails")
public class Cardetails{
	@Id
	private int id;
	private String name;
	
	private int price;
	private String type;
	private  String color;
	private String  fueltype;
	private String gear;
	private int resalevalue;
	private int rating;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFueltype() {
		return fueltype;
	}
	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	public String getGear() {
		return gear;
	}
	public void setGear(String gear) {
		this.gear = gear;
	}
	public int getResalevalue() {
		return resalevalue;
	}
	public void setResalevalue(int resalevalue) {
		this.resalevalue = resalevalue;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Cardetails [id=" + id + ", name=" + name + ", price=" + price + ", type=" + type + ", color=" + color
				+ ", fueltype=" + fueltype + ", gear=" + gear + ", resalevalue=" + resalevalue + ", rating=" + rating
				+ "]";
	}
	
	
	
	
	
	
	

}
