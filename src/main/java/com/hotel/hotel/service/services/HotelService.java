package com.hotel.hotel.service.services;

import java.util.List;

import com.hotel.hotel.service.entities.Hotel;

public interface HotelService {

	Hotel createHotel(Hotel hotel);
	
	List<Hotel> getAllHotel();
	
	Hotel get(String id);
	
}
