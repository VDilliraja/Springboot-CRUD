package edu.jsp.Product_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.jsp.Product_app.model.Product;
import edu.jsp.Product_app.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService service;

	@PostMapping("/save")
	public Product saveProduct(@RequestBody Product p) {

		return service.saveProduct(p);
	}

	// http://localhost:8080/get?id=1
	@GetMapping("/get")
	public Product fetchbyid(@RequestParam int id) {
		return service.fetchbyid(id);
	}

	@GetMapping("/getAll")
	public List<Product> findAll() {
		return service.fetchAll();
	}

	// http://localhost:8080/delete/1
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		return service.delete(id);
	}

	// http://localhost:8080/update?id=1
	@PutMapping("/update")
	public Product updateProduct(@RequestParam int id, @RequestBody Product p) {
		return service.updateProduct(id, p);

	}

}
