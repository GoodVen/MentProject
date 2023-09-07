package com.example.MentProject.repositories;

import com.example.MentProject.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;




public interface ProductRepository extends JpaRepository<Product, Long> {

}
