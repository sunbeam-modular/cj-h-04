package com.sunbeam;

import java.io.Serializable;

public class Movie implements Serializable {
	//private static final long serialVersionUID = 1L; // represents object structure/schema version
	private int id;
	private String title;
	private double rating;
	transient private String director; // transient fields are not serialized and deserialized
	static String theatre = "PVR";
	public Movie() {
	}
	public Movie(int id, String title, double rating) {
		this.id = id;
		this.title = title;
		this.rating = rating;
	}
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
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", rating=" + rating + "]";
	}
}
