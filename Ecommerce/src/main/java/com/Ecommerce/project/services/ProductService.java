package com.Ecommerce.project.services;

import com.Ecommerce.project.models.ProductModel;
import java.util.List;

public interface ProductService {
    ProductModel createProduct(String title);
    List<ProductModel> getAllProducts();
   /* ProductModel updateProduct(Long productId, ProductModel product);
    void deleteProduct(Long productId);

    ProductModel getProductById(Long productId);
    List<ProductModel> searchProducts(String keyword);

    */
}
