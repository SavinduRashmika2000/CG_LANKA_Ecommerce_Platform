package com.Ecommerce.project.services;

import com.Ecommerce.project.models.ProductModel;
import java.util.List;

public interface ProductService {
    ProductModel createProduct(ProductModel product);
    ProductModel updateProduct(Long productId, ProductModel product);
    void deleteProduct(Long productId);
    List<ProductModel> getAllProducts();
    ProductModel getProductById(Long productId);
    List<ProductModel> searchProducts(String keyword);
}
