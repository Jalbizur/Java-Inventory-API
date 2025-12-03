package com.example.Inventory_Management.model;
import jakarta.persistence.*;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Table;
//import jakarta.persistence.Id;

@Entity
@Table(name = "products")
public class Product {

    //@Column (name = "productId")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment
    private long id;

    private String name;
    private int quantity;
    private double price;

    public Product() {}

    public Product(String name, int quantity, double price) {

        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // Our Getters & Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
