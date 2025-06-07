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
    public List<ProductModel> getAllProducts() {
        return productRepository.findAll();
    }


    public ProductModel updateProduct(Long productId, ProductModel product) {
        ProductModel existing = productRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        if (product.getTitle() != null) existing.setTitle(product.getTitle());
        if (product.getGender() != null) existing.setGender(product.getGender());
        if (product.getType() != null) existing.setType(product.getType());
        if (product.getPrice() != 0) existing.setPrice(product.getPrice());
        if (product.getDescription() != null) existing.setDescription(product.getDescription());

        if (product.getImage1() != null) existing.setImage1(product.getImage1());
        if (product.getImage2() != null) existing.setImage2(product.getImage2());
        if (product.getImage3() != null) existing.setImage3(product.getImage3());
        if (product.getImage4() != null) existing.setImage4(product.getImage4());
        if (product.getImage5() != null) existing.setImage5(product.getImage5());

        return productRepository.save(existing);
    }


    @Override
    public ProductModel deleteProduct(Long productId) {
        ProductModel existing = productRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));
        productRepository.deleteById(productId);
        return (existing);

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
