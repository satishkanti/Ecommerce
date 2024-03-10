package com.kanti.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanti.ecommerce.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{
    
}
