package com.hotel.hotel.service.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.hotel.service.entities.Hotel;
import com.hotel.hotel.service.services.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {

	@Autowired
	private HotelService hotelService;
	
	//create
	@PostMapping
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
		return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.createHotel(hotel));
	}
	
	//get single hotel
	@GetMapping("/{hotelId}")
	public ResponseEntity<Hotel> getSingleHotel(@PathVariable String hotelId){
		return ResponseEntity.ok(hotelService.get(hotelId));
	}
	
	@GetMapping
	public ResponseEntity<List<Hotel>> getAllHotel(){
		return ResponseEntity.ok(hotelService.getAllHotel());
	}
}
