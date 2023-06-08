package com.example.demo.moviesdto;

import com.example.demo.entity.Ratings;

public class MoviesDto {
	
	private String tconst;
	private String titletype;
	private String primarytitle;
	private String runtimeminutes;
	private String genres;
	private Ratings ratings;
	public Ratings getRatings() {
		return ratings;
	}
	public void setRatings(Ratings ratings) {
		this.ratings = ratings;
	}
	public String getTconst() {
		return tconst;
	}
	public void setTconst(String tconst) {
		this.tconst = tconst;
	}
	public String getTitletype() {
		return titletype;
	}
	public void setTitletype(String titletype) {
		this.titletype = titletype;
	}
	public String getPrimarytitle() {
		return primarytitle;
	}
	public void setPrimarytitle(String primarytitle) {
		this.primarytitle = primarytitle;
	}
	public String getRuntimeminutes() {
		return runtimeminutes;
	}
	public void setRuntimeminutes(String runtimeminutes) {
		this.runtimeminutes = runtimeminutes;
	}
	public String getGenres() {
		return genres;
	}
	public void setGenres(String genres) {
		this.genres = genres;
	}
	
	

}
