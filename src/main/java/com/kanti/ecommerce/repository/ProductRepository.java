package com.kanti.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanti.ecommerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    List<Product> findAllByCategory_Id(int id);
    
}
