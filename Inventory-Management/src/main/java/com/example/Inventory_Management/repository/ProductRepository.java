package com.example.Inventory_Management.repository;

import com.example.Inventory_Management.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long>{

}