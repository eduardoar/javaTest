package com.rosales.prueba.service;

import com.rosales.prueba.model.data.ProductDetailResponse;

import java.util.List;

public interface ProductService {

    List<ProductDetailResponse> listSimilarProduct(String productId);

}
