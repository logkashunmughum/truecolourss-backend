package com.ucc.application.repository;



import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.ucc.application.model.ReviewModel;
import com.ucc.application.model.ReviewTypeModel;

@Repository
public interface ReviewTypeRepository extends MongoRepository<ReviewTypeModel, String> {

	@Query("{'Review_ID': {'$in' : ?0 }}")
	List<ReviewTypeModel> findAll(List<Integer> reviewIdList);

}
