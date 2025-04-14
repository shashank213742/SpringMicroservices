package com.hotel.service;

import java.util.List;

import com.hotel.entities.Hotel;

public interface HotelService {
	
	Hotel create(Hotel hotel);
	List<Hotel> getAllHotel();
	Hotel getHotel(String id);
	

}
