package com.example.MentProject.model;

public class ProductDTO { // DTO - data transfer object
    private Long id;
    private String name;
    private String description;
    private int price;

    public ProductDTO() {
    }

    public ProductDTO(Long id, String name, String description, int price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    // getters and setters
}
