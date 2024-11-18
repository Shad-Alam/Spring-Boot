package com.shad.product_service.service;

import com.shad.product_service.dto.ProductRequest;
import com.shad.product_service.dto.ProductResponse;
import com.shad.product_service.model.Product;
import com.shad.product_service.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // for the service class
@RequiredArgsConstructor // for create arg constructor
@Slf4j // Lombok generates the 'logger' field
public class ProductService {

    private final ProductRepository productRepository;

//    public ProductService(ProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }

    public void createProduct(ProductRequest productRequest){
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();

        productRepository.save(product);
        log.info("Product {} is saved", product.getId());
    }

    public List<ProductResponse> getAllProduct() {
        List<Product> products = productRepository.findAll();
//        products.stream().map(product -> mapToProductResponse(product));
        return products.stream().map(this::mapToProductResponse).toList();
    }

    private ProductResponse mapToProductResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }
}
