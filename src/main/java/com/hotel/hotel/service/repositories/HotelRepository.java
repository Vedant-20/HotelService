package com.hotel.hotel.service.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.hotel.service.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel,String> {

}
