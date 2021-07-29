package com.ucc.application.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ucc.application.model.HotelListModel;
import com.ucc.application.model.ReviewListModel;
import com.ucc.application.model.ReviewModel;
import com.ucc.application.model.ReviewTypeModel;
import com.ucc.application.repository.HotelListRepository;
import com.ucc.application.repository.ReviewRepository;
import com.ucc.application.repository.ReviewTypeRepository;

@Service
public class ReviewService {

	@Autowired
	public HotelListRepository hotelListRepository;

	@Autowired
	public ReviewRepository reviewRepository;

	@Autowired
	public ReviewTypeRepository reviewTypeRepository;
	
	
	public ReviewListModel reviewListModel = new ReviewListModel();

	public static final String CORK = "Cork";

	public static final String DUBLIN = "Dublin";

	public List<String> getUsingCityName(String cityName) {

		List<HotelListModel> hotelList = new ArrayList<>();

		ArrayList<String> hotels = new ArrayList<>();

		if (cityName.equalsIgnoreCase(CORK)) {
			hotelList = hotelListRepository.findByCityName(CORK);
		} else {
			hotelList = hotelListRepository.findByCityName(DUBLIN);
		}

		for (HotelListModel hotel : hotelList) {
			hotels.add(hotel.getHotel_name());
		}

		return hotels;
	}

	public ReviewListModel getUsingHotelName(String hotelName) {

		List<ReviewModel> reviewList = reviewRepository.findByHotelName(hotelName);
		List<ReviewModel> finalList = new ArrayList<>();
		List<Integer> reviewIdList = new ArrayList<>();
		List<ReviewTypeModel> reviewTypeModelList = new ArrayList<>();
		
		for (ReviewModel rm : reviewList) {
			if (rm.getSentiment_score() < 0) {
				finalList.add(rm);
				reviewIdList.add(rm.getReview_id());
			}
		}
		
		reviewTypeModelList = reviewTypeRepository.findAll(reviewIdList);
		
		Collections.sort(finalList, ReviewModel.sentiScore);
		
		reviewListModel.setReviewModelList(finalList);
		reviewListModel.setReviewTypeModelList(reviewTypeModelList);	
		
		return reviewListModel;
		

	}

}
