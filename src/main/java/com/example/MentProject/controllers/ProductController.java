package com.example.MentProject.controllers;

import com.example.MentProject.models.Product;
import com.example.MentProject.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
public class ProductController {

    private ProductService productService;


    @Autowired
    public ProductController(ProductService productService){
         this.productService = productService;
    }

    @GetMapping("/")
    public List<Product> getProduct(@RequestParam String name){
       return productService.getProduct(name);
    }

    @PostMapping("/product/create")
    public String createProduct(Product product) throws IOException {
        productService.saveProduct(product);
        return "redirect:/";
    }

    @PostMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
        return "redirect:/";
    }

}
