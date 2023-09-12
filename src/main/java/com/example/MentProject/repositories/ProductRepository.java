package com.example.MentProject.repositories;

import com.example.MentProject.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// Only one empty line is allowed between imports and the first class declaration.
public interface ProductRepository extends JpaRepository<Product, Long> {
}
// Good! Each file should end with a single empty line. Why? See https://stackoverflow.com/a/729795/1157054