package com.example.demo.moviesrespository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Ratings;

@Repository
public interface RatingsRepository extends JpaRepository<Ratings, String>{

}
