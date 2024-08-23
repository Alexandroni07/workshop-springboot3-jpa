package com.projectspring.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectspring.couse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>  {

}
