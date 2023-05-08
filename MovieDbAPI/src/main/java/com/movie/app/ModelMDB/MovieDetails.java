package com.movie.app.ModelMDB;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class MovieDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	
	private boolean adult;
	private int budget;
	private String genre;
	
	private  String about;
	private String orgLanguage;
	private String dubLanguage;
	private int rating;
	private int runTime;
	private String director;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private ReleaseDetails release;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isAdult() {
		return adult;
	}
	public void setAdult(boolean adult) {
		this.adult = adult;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getOrgLanguage() {
		return orgLanguage;
	}
	public void setOrgLanguage(String orgLanguage) {
		this.orgLanguage = orgLanguage;
	}
	public String getDubLanguage() {
		return dubLanguage;
	}
	public void setDubLanguage(String dubLanguage) {
		this.dubLanguage = dubLanguage;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getRunTime() {
		return runTime;
	}
	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public ReleaseDetails getRelease() {
		return release;
	}
	public void setRelease(ReleaseDetails release) {
		this.release = release;
	}
	@Override
	public String toString() {
		return "MovieDetails [id=" + id + ", title=" + title + ", adult=" + adult + ", budget=" + budget + ", genre="
				+ genre + ", about=" + about + ", orgLanguage=" + orgLanguage + ", dubLanguage=" + dubLanguage
				+ ", rating=" + rating + ", runTime=" + runTime + ", director=" + director + ", release=" + release
				+ "]";
	}
	
}