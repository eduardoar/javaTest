package com.rosales.prueba.service.impl;

import com.rosales.prueba.client.ProductMockClient;
import com.rosales.prueba.model.data.ProductDetailResponse;
import com.rosales.prueba.service.ProductMockService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductMockServiceImpl implements ProductMockService {

    @Autowired
    private ProductMockClient productMockClient;

    @Override
    public List<String> listSimilarIdsProduct(String productId) {
        return productMockClient.listSimilarIdsProduct(productId);
    }

    @Override
    @CircuitBreaker(name = "productDetailCircuitBreaker", fallbackMethod = "searchProductDetailFallback")
    public ProductDetailResponse searchProductDetail(String productId) {
        return productMockClient.searchProductDetail(productId);
    }

    private ProductDetailResponse searchProductDetailFallback(Exception e) {
        return ProductDetailResponse.builder().build();
    }

}
