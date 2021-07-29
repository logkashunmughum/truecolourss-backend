package com.ucc.application.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import com.ucc.application.model.HotelListModel;

@Repository
public interface HotelListRepository extends MongoRepository<HotelListModel, String> {

	@Query("{'hotel_name': ?0}")
	List<HotelListModel> findByHotelName(String hotel_name);
	
	@Query("{'city_name': ?0}")
	List<HotelListModel> findByCityName(String city_name);
	
}
