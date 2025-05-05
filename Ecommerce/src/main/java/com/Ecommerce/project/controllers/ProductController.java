package com.Ecommerce.project.controllers;

import com.Ecommerce.project.models.ProductModel;
import com.Ecommerce.project.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    // Create a new product
    @PostMapping
    public ProductModel createProduct(@RequestBody String title) {
       return productService.createProduct(title);
    }

    @GetMapping
    public List<ProductModel> getAllProducts() {
        return  productService.getAllProducts();
    }
   /*
    // Update an existing product
    @PutMapping("/{id}")
    public ResponseEntity<ProductModel> updateProduct(
            @PathVariable Long id,
            @RequestBody ProductModel product
    ) {
        ProductModel updatedProduct = productService.updateProduct(id, product);
        return ResponseEntity.ok(updatedProduct);
    }

    // Delete a product by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }

    // Get all products


    // Get a product by ID
    @GetMapping("/{id}")
    public ResponseEntity<ProductModel> getProductById(@PathVariable Long id) {
        ProductModel product = productService.getProductById(id);
        return ResponseEntity.ok(product);
    }

    // Search products by title (keyword)
    @GetMapping("/search")
    public ResponseEntity<List<ProductModel>> searchProducts(
            @RequestParam String keyword
    ) {
        List<ProductModel> products = productService.searchProducts(keyword);
        return ResponseEntity.ok(products);
    }

    // Optional: Upload 5 images and associate them with a product
    @PostMapping("/upload")
    public ResponseEntity<ProductModel> addProductWithImages(
            @RequestParam String title,
            @RequestParam String gender,
            @RequestParam String type,
            @RequestParam int price,
            @RequestParam String description,
            @RequestParam MultipartFile image1,
            @RequestParam MultipartFile image2,
            @RequestParam MultipartFile image3,
            @RequestParam MultipartFile image4,
            @RequestParam MultipartFile image5
    ) {

        String url1 = "https://yourcdn.com/" + image1.getOriginalFilename();
        String url2 = "https://yourcdn.com/" + image2.getOriginalFilename();
        String url3 = "https://yourcdn.com/" + image3.getOriginalFilename();
        String url4 = "https://yourcdn.com/" + image4.getOriginalFilename();
        String url5 = "https://yourcdn.com/" + image5.getOriginalFilename();

        ProductModel product = new ProductModel();
        product.setTitle(title);
        product.setGender(gender);
        product.setType(type);
        product.setPrice(price);
        product.setDescription(description);
        product.setImage1(url1);
        product.setImage2(url2);
        product.setImage3(url3);
        product.setImage4(url4);
        product.setImage5(url5);

        ProductModel createdProduct = productService.createProduct(product);
        return ResponseEntity.ok(createdProduct);
    }

    */
}
