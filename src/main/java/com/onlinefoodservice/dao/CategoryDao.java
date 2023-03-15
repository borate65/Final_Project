package com.onlinefoodservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinefoodservice.model.Category;

public interface CategoryDao extends JpaRepository<Category, Integer> {
	

}
