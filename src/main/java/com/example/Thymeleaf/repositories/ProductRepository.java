package com.example.Thymeleaf.repositories;

import com.example.Thymeleaf.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
