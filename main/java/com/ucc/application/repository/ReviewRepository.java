package com.ucc.application.repository;

import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.ucc.application.model.ReviewModel;

@Repository
public interface ReviewRepository extends MongoRepository<ReviewModel, String> {

	@Query("{'reviewer_name': ?0}")
	List<ReviewModel> findByReviewerName(String reviewer_name);
	
	@Query("{'listing_id': ?0}")
	List<ReviewModel> findByListingId(int listing_id);
	
	@Query("{'reviewer_id': ?0}")
	List<ReviewModel> findByReviewId(int review_id);

	@Query("{'hotel_name': ?0}")
	List<ReviewModel> findByHotelName(String hotelName);
	
}
