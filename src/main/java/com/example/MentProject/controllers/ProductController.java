package com.example.MentProject.controllers;

import com.example.MentProject.entity.Product;
import com.example.MentProject.entity.ProductConverter;
import com.example.MentProject.models.ProductDTO;
import com.example.MentProject.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController("/product/")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public List<ProductDTO> getAllProducts() {

        return productService.getAllProducts().stream()
                .map(ProductConverter::convertToDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/product/{id}")
    public Optional<Product> getProductById(@PathVariable("id") Long productId) {
        return productService.getProductById(productId);
    }

    @PostMapping("/product/create")
    public void createProduct(ProductDTO product) throws IOException {
        // You need to convert ProductDTO to Product
        productService.saveProduct(ProductConverter.convertToEntity(product));
    }

    @PutMapping("/product/{id}")
    public void productUpdate(@RequestBody ProductDTO product) {
        productService.updateProduct(ProductConverter.convertToEntity(product));
    }

    @DeleteMapping("/product/delete/{id}")
    public void deleteProduct(@PathVariable Long id) {productService.deleteProduct(id);
    }
}
