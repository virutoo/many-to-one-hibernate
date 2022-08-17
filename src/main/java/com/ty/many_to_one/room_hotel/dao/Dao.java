package com.ty.many_to_one.room_hotel.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.many_to_one.room_hotel.dto.Room;

public class Dao {

	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
	static EntityManager entityManager = factory.createEntityManager();
	
	public void saveRoom(Room room) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(room);
		entityManager.persist(room.getHotel());
		transaction.commit();
	}
	
	public Room getRoom(int id) {
		return entityManager.find(Room.class, id);
	}

}
