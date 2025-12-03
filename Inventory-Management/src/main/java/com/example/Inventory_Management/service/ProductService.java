package com.example.Inventory_Management.service;


import com.example.Inventory_Management.model.Product;
import com.example.Inventory_Management.repository.ProductRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class ProductService{

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product addProduct(Product product) {
        return repository.save(product);
    }

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public Product getProduct(Long id) {
        return repository.findById(id).orElse(null);
    }


    public Product updateProduct(Long id, Product updated) {

        Product existing = repository.findById(id).orElse(null);


        if (existing == null) {
            return null;
        }

        existing.setName(updated.getName());
        existing.setQuantity(updated.getQuantity());
        existing.setPrice(updated.getPrice());

        return repository.save(existing);
    }

    public boolean deleteProduct(Long id) {
        if(!repository.existsById(id))
            return false;
        repository.deleteById(id);
        return true;
    }

}