package com.studying.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studying.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
