package com.ucc.application.model;



import org.springframework.data.mongodb.core.mapping.Document;

@Document("review")
public class ReviewTypeModel {

	private String status;
	private int Review_ID;
	private int count;
	private String adjectives;

	public ReviewTypeModel() {

	}

	public ReviewTypeModel(String status, int review_ID, int count, String adjectives) {
		super();
		this.status = status;
		this.Review_ID = review_ID;
		this.count = count;
		this.adjectives = adjectives;

	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getAdjectives() {
		return adjectives;
	}

	public void setAdjectives(String adjectives) {
		this.adjectives = adjectives;
	}

	public int getReview_ID() {
		return Review_ID;
	}

	public void setReview_ID(int review_ID) {
		Review_ID = review_ID;
	}

}
