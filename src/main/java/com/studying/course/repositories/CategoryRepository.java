package com.studying.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studying.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
