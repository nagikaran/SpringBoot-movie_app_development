package com.example.demo.moviesservice;

import java.util.List;

import com.example.demo.moviesdto.MoviesDto;

public interface MoviesServiceInterface {
	
	public List<MoviesDto> getTopTenMoviesWithTheLongestDuration();

	public MoviesDto addnewMovies(MoviesDto moviesDto);	
	
	public List<MoviesDto> getTheMoviesRatingMoreThenSix();

}
