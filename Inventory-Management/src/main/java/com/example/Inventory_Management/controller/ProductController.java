package com.example.Inventory_Management.controller;

import com.example.Inventory_Management.model.Product;
import com.example.Inventory_Management.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return service.addProduct(product);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }

    @GetMapping("/{productId}")
    public Product getProductById(@PathVariable long productId) {
        return service.getProduct(productId);
    }

    @DeleteMapping("/{productId}")
    public String deleteProductById(@PathVariable long productId) {
        return service.deleteProduct(productId) ? "Deleted" : "Not Found";
    }
}