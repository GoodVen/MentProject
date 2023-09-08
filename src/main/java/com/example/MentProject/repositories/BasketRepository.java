package com.example.MentProject.repositories;

import com.example.MentProject.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasketRepository extends JpaRepository<Product, Long> {
}
