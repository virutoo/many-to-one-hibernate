package com.ty.many_to_one.review_product.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.many_to_one.review_product.dto.Product;
import com.ty.many_to_one.review_product.dto.Review;

public class Dao {
	
	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
	static EntityManager entityManager = factory.createEntityManager();
	
	public void saveReview(Review review) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(review);
		if(entityManager.find(Product.class, review.getProduct().getId()) == null) {
			entityManager.persist(review.getProduct());
		}
		transaction.commit();
	}

}
