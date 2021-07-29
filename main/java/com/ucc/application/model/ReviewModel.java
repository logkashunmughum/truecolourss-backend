package com.ucc.application.model;

import java.util.Comparator;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sample_collection")
public class ReviewModel {

	@Id
	private String id;
	private String comments;
	private int listing_id;
	private int review_id;
	private String hotel_name;
	private int rating;
	private float sentiment_score;
	
	// private String reviewType;

	public ReviewModel() {

	}

	public ReviewModel(String id,String comments, int listing_id, int review_id,
			String hotel_name, int rating, float sentiment_score, List<ReviewTypeModel> reviewTypeModelList) {
		super();
		this.id = id;
		this.comments = comments;
		this.listing_id = listing_id;
		this.review_id = review_id;
		this.hotel_name = hotel_name;
		this.rating = rating;
		this.sentiment_score = sentiment_score;
		//this.reviewType = reviewType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public int getListing_id() {
		return listing_id;
	}

	public void setListing_id(int listing_id) {
		this.listing_id = listing_id;
	}

	public int getReview_id() {
		return review_id;
	}

	public void setReview_id(int review_id) {
		this.review_id = review_id;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public float getSentiment_score() {
		return sentiment_score;
	}

	public void setSentiment_score(float sentiment_score) {
		this.sentiment_score = sentiment_score;
	}

	public String getHotel_name() {
		return hotel_name;
	}

	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}

//	public String getReviewType() {
//		return reviewType;
//	}
//
//	public void setReviewType(String reviewType) {
//		this.reviewType = reviewType;
//	}

	public static Comparator<ReviewModel> sentiScore = new Comparator<ReviewModel>() {

		public int compare(ReviewModel s1,ReviewModel s2){

	int sentiScore1=(int)Math.abs(s1.getSentiment_score()*1000);int sentiScore2=(int)Math.abs(s2.getSentiment_score()*1000);return(sentiScore2-sentiScore1);}};

	@Override
	public String toString() {
		return "ReviewModel [id=" + id + ", comments=" + comments + ", listing_id=" + listing_id + ", review_id="
				+ review_id + ", hotel_name=" + hotel_name + ", rating=" + rating + ", sentiment_score="
				+ sentiment_score + "]";
	}

}
