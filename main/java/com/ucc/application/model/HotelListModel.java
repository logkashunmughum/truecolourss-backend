package com.ucc.application.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "hotel_list")
public class HotelListModel {

	private String city_name;
	private String hotel_name;

	public HotelListModel() {

	}

	public HotelListModel(String city_name, String hotel_name) {
		super();
		this.city_name = city_name;
		this.hotel_name = hotel_name;
	}

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public String getHotel_name() {
		return hotel_name;
	}

	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}

	
	

	

}
