package com.family.app.Models;

import jakarta.persistence.Entity;

@Entity
public class Family {
private String name;
private String relation;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getRelation() {
	return relation;
}
public void setRelation(String relation) {
	this.relation = relation;
}
private int age;public Family() {
	// TODO Auto-generated constructor stub
}

}
