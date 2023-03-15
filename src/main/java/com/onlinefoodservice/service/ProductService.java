package com.onlinefoodservice.service;

import org.springframework.web.multipart.MultipartFile;

import com.onlinefoodservice.model.Product;

public interface ProductService {
	
	void addProduct(Product product, MultipartFile productImmage);

}
