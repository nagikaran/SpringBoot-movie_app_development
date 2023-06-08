package com.example.demo.moviesserviceimplementation;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Movies;
import com.example.demo.moviesdto.MoviesDto;
import com.example.demo.moviesrespository.MoviesRespositoryInterface;
import com.example.demo.moviesservice.MoviesServiceInterface;

@Service
public class MoviesServiceImplementation implements MoviesServiceInterface {
	@Autowired
	MoviesRespositoryInterface moviesRepository;
	
	

	@Override
	public List<MoviesDto> getTopTenMoviesWithTheLongestDuration() {
		List<Movies> findTop10MoviesAndMovieWithLongestDuration = moviesRepository.findTop10MoviesAndMovieWithLongestDuration();
		
		List<MoviesDto> collectionsOfTenMovies = findTop10MoviesAndMovieWithLongestDuration.stream().map((entity)->entityToMoviesClassDto(entity)).collect(Collectors.toList());
		
		
		// TODO Auto-generated method stub
		return  collectionsOfTenMovies;
	}
	
	@Override
	public MoviesDto addnewMovies(MoviesDto moviesDto) {
		// TODO Auto-generated method stub
		Movies dtoToMoviesClass = dtoToMoviesClass(moviesDto);
		Movies save = moviesRepository.save(dtoToMoviesClass);
		 MoviesDto entityToMoviesClassDto = entityToMoviesClassDto(save);
	
		
		return entityToMoviesClassDto;
	}
	/*Method to get the movies whose ratings is above 6*/
	
	public List<MoviesDto> getTheMoviesRatingMoreThenSix(){
		List<Movies> averageratingOfMoviesGreaterThanSix = moviesRepository.findByRatingsAverageratingGreaterThanOrderByRatingsAverageratingAsc(6.0);
		for(Movies mSix:averageratingOfMoviesGreaterThanSix) {
			mSix.getRatings().getAveragerating();
		}
		List<MoviesDto> moviesWithAverageRatingMoreThenSix = averageratingOfMoviesGreaterThanSix.stream().map((entity)->entityToMoviesClassDto(entity)).collect(Collectors.toList());
		for(MoviesDto mSix:moviesWithAverageRatingMoreThenSix) {
			mSix.getRatings().getAveragerating();
		}
		return moviesWithAverageRatingMoreThenSix;
	}
	
	
	
	/*create the methods to create the dto to the entity and the entity to the dto*/
	private Movies dtoToMoviesClass(MoviesDto dto) {
		ModelMapper mm = new ModelMapper();
		return mm.map(dto, Movies.class);
	}

	private MoviesDto entityToMoviesClassDto(Movies entity) {
		ModelMapper mm = new ModelMapper();
		return mm.map(entity, MoviesDto.class);
	}

}
