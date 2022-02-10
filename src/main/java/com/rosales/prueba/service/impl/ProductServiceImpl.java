package com.rosales.prueba.service.impl;

import com.rosales.prueba.model.data.ProductDetailResponse;
import com.rosales.prueba.service.ProductMockService;
import com.rosales.prueba.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.nonNull;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMockService productMockService;

    @Override
    public List<ProductDetailResponse> listSimilarProduct(String productId) {

        List<ProductDetailResponse> listSimilarProduct = new ArrayList<>();

        var listSimilarIdsProduct = productMockService.listSimilarIdsProduct(productId);

        listSimilarIdsProduct.forEach(id -> {
            var productMockDetail = productMockService.searchProductDetail(id);
            if (nonNull(productMockDetail.getId())) {
                listSimilarProduct.add(productMockDetail);
            }
        });

        return listSimilarProduct;

    }
}
