package com.ty.many_to_one.room_hotel.controller;

import com.ty.many_to_one.room_hotel.dao.Dao;
import com.ty.many_to_one.room_hotel.dto.Hotel;
import com.ty.many_to_one.room_hotel.dto.Room;

public class SaveRoom {
	
	public static void main(String[] args) {
		Room room = new Room();
		Hotel hotel = new Hotel();
		hotel.setId(1);
		hotel.setName("hotel transyvania");
		hotel.setAddress("unknown");
		
		room.setHotel(hotel);
		room.setCapacity(5);
		room.setId(2);
		room.setType("ac");
		
		Dao dao = new Dao();
		dao.saveRoom(room);
		System.out.println("data saved");
	}

}
