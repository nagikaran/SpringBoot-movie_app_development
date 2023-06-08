package com.example.demo.constants;

public interface UrlPaths {
	
	
	final String APPLICATION_BASE_VERSION="/api/v1";
	
	final String MOVIES_CLASS_URL=APPLICATION_BASE_VERSION+"/moviesClass";
	
	/*to get the List of the first top 10 movies who has the longest duration*/
	final String GET_THE_TOP_TEN_MOVIES_WITH_LONGEST_DURATION="/getTheTopTenMoviesLongestDuratiuon";
	/*Addition of New Movie*/
	final String ADDITION_OF_NEW_MOVIE="/addMovies";
	
	final String GET_THE_MOVIES_WHOSE_AVERAGE_RATING_MORE_THEN_SIX="/moviesRatingMoreThenSix";

}
