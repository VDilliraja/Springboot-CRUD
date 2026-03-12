package edu.jsp.Product_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.jsp.Product_app.model.Product;
import edu.jsp.Product_app.repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	ProductRepo repo;

	public Product saveProduct(Product p) {

		return repo.save(p);

	}

	public Product fetchbyid(int id) {

		return repo.findById(id).get();
	}

	public String delete(int id) {
		repo.deleteById(id);

		return "Data  deleted";
	}

	public List<Product> fetchAll() {
		return repo.findAll();
	}

	public Product updateProduct(int id, Product newObj) {

		Product oldObj = repo.findById(id).get();

		if (oldObj != null) {

			newObj.setId(id);

			return repo.save(newObj);

		}
		return null;

	}

}
