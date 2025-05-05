package com.Ecommerce.project.services.impl;

import com.Ecommerce.project.models.ProductModel;
import com.Ecommerce.project.repositories.ProductRepository;
import com.Ecommerce.project.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductModel createProduct(ProductModel product) {
        return productRepository.save(product);
    }

    @Override
    public ProductModel updateProduct(Long productId, ProductModel product) {
        ProductModel existing = productRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        existing.setTitle(product.getTitle());
        existing.setGender(product.getGender());
        existing.setType(product.getType());
        existing.setPrice(product.getPrice());
        existing.setDescription(product.getDescription());
        existing.setImage1(product.getImage1());
        existing.setImage2(product.getImage2());
        existing.setImage3(product.getImage3());
        existing.setImage4(product.getImage4());
        existing.setImage5(product.getImage5());

        return productRepository.save(existing);
    }

    @Override
    public void deleteProduct(Long productId) {
        productRepository.deleteById(productId);
    }

    @Override
    public List<ProductModel> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public ProductModel getProductById(Long productId) {
        return productRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    @Override
    public List<ProductModel> searchProducts(String keyword) {
        return productRepository.findByTitleContaining(keyword);
    }
}
