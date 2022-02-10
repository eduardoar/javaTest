package com.rosales.prueba.service;

import com.rosales.prueba.model.data.ProductDetailResponse;

import java.util.List;

public interface ProductMockService {

    List<String> listSimilarIdsProduct(String productId);

    ProductDetailResponse searchProductDetail(String productId);

}
