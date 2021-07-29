package com.ucc.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ucc.application.model.HotelListModel;
import com.ucc.application.model.ReviewListModel;
import com.ucc.application.model.ReviewModel;
import com.ucc.application.repository.HotelListRepository;
import com.ucc.application.repository.ReviewRepository;
import com.ucc.application.service.ReviewService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/truecolours")
public class ReviewController {

	@Autowired
	public ReviewRepository reviewRepository;
	
	@Autowired
	public ReviewService reviewService;

	@GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ReviewModel> getAllReviews() {
		return reviewRepository.findAll();
	}
	
	@GetMapping(value ="/", produces = MediaType.APPLICATION_JSON_VALUE)
	public String sampleMethod() {
		return "Hello World";
	}

	@GetMapping(value = "/reviewerName/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ReviewModel> getReviewsWithName(
			@PathVariable String name) {
				return  reviewRepository.findByReviewerName(name);
		
	}
	
	@GetMapping(value = "/listingId/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ReviewModel> getReviewsWithListingId(
			@PathVariable Integer id) {
				return  reviewRepository.findByListingId(id);
		
	}
	
	@GetMapping(value = "/review_id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ReviewModel> getReviewsWithReviewId(
			@PathVariable Integer id) {
				return  reviewRepository.findByReviewId(id);
		
	}

	@PostMapping(value = "/saveReview", produces = MediaType.APPLICATION_JSON_VALUE)
	public String saveReview(@RequestBody ReviewModel reviewModel) {
		reviewRepository.save(reviewModel);
		return "Review added successfuly";

	}
	
	@GetMapping(value = "/city_name/{cityname}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<String> getReviewsWithCityName(
			@PathVariable String cityname) {
				return  reviewService.getUsingCityName(cityname);
		
	}
	
	@GetMapping(value = "/hotel_name", produces = MediaType.APPLICATION_JSON_VALUE)
	public ReviewListModel getReviewsWithHotelName(
			@RequestHeader("hotel-name") String hotelName) {
				return  reviewService.getUsingHotelName(hotelName);
		
	}

}
