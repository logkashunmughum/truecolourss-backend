package com.ucc.application.model;

import java.util.List;


public class ReviewListModel {

	private List<ReviewModel> reviewModelList;
	private List<ReviewTypeModel> reviewTypeModelList;
	
	public ReviewListModel() {
		
	}
	public ReviewListModel(List<ReviewModel> reviewModelList, List<ReviewTypeModel> reviewTypeModelList) {
		super();
		this.reviewModelList = reviewModelList;
		this.reviewTypeModelList = reviewTypeModelList;
	}
	public List<ReviewModel> getReviewModelList() {
		return reviewModelList;
	}
	public void setReviewModelList(List<ReviewModel> reviewModelList) {
		this.reviewModelList = reviewModelList;
	}
	public List<ReviewTypeModel> getReviewTypeModelList() {
		return reviewTypeModelList;
	}
	public void setReviewTypeModelList(List<ReviewTypeModel> reviewTypeModelList) {
		this.reviewTypeModelList = reviewTypeModelList;
	}
	@Override
	public String toString() {
		return "ReviewListModel [reviewModelList=" + reviewModelList + ", reviewTypeModelList=" + reviewTypeModelList
				+ "]";
	}
	
	
}
