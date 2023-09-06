package com.example.MentProject.repositories;

import com.example.MentProject.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByTitle(String title);


    // DAO pattern - data access object
    // =
    // Repository pattern
    //
    // Spring DATA
}
