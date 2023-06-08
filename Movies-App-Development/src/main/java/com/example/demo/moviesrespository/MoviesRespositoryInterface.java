package com.example.demo.moviesrespository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Movies;

@Repository
public interface MoviesRespositoryInterface extends JpaRepository<Movies, String> {
	

	@Query(value = "SELECT * FROM movies WHERE runtimeminutes = (SELECT MAX(runtimeminutes) FROM movies) " +
            "UNION " +
            "SELECT * FROM movies ORDER BY runtimeminutes DESC LIMIT 10", nativeQuery = true)
    List<Movies> findTop10MoviesAndMovieWithLongestDuration();
	
	/*To get the List of the movies whoes rating are above 6*/
	/*
	 * @Query("SELECT m FROM Movies m JOIN m.ratings r WHERE r.averageRating > :averageRating ORDER BY r.averageRating DESC"
	 * ) List<Movies> findByAverageRatingGreaterThanOrderByAverageRatingDesc(Double
	 * averagetrating);
	 */
	List<Movies> findByRatingsAverageratingGreaterThanOrderByRatingsAverageratingAsc(Double averageRating);


	    

}
