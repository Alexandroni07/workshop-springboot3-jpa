package com.projectspring.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectspring.couse.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
