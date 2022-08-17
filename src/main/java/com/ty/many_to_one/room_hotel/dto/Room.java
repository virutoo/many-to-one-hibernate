package com.ty.many_to_one.room_hotel.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Room {

	@Id
	private int id;
	private int capacity;
	private String type;

	@ManyToOne
	private Hotel hotel;

	@Override
	public String toString() {
		return "Room [id=" + id + ", capacity=" + capacity + ", type=" + type + ", hotel=" + hotel + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

}
