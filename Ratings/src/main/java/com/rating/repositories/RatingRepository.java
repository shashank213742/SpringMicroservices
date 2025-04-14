package com.rating.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rating.entities.Rating;

public interface RatingRepository extends MongoRepository<Rating, String>{

	//Rating create(Rating rating);
	List<Rating> findByHotelId(String hotelId);
	List<Rating> findByUserId(String userId);
	
	
	
}
