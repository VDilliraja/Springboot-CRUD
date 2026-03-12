package edu.jsp.Product_app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.jsp.Product_app.model.Product;

public interface ProductRepo  extends    JpaRepository<Product, Integer>{
	
	//save
	//findById
	//deleteByid
	//findAll
	

}
