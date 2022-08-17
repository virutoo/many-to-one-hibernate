package com.ty.many_to_one.review_product.controller;

import com.ty.many_to_one.review_product.dao.Dao;
import com.ty.many_to_one.review_product.dto.Product;
import com.ty.many_to_one.review_product.dto.Review;

public class SaveReview {
	
	public static void main(String[] args) {
		Review review = new Review();
		Product product = new Product();
		
		product.setId(2);
		product.setName("cream biscuits");
		product.setBrand("britannia");
		product.setCost(20);
		
		review.setProduct(product);
		review.setId(5);
		review.setUserName("luffy");
		review.setDescription("want meat flavour");
		
		Dao dao = new Dao();
		dao.saveReview(review);
		System.out.println("data saved");
	}

}
