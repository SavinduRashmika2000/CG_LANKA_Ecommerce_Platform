package com.Ecommerce.project.repositories;

import com.Ecommerce.project.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductModel, Long> {
    List<ProductModel> findByTitleContaining(String keyword);
}
