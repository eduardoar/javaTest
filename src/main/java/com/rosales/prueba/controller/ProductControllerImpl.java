package com.rosales.prueba.controller;

import com.rosales.prueba.model.data.ProductDetailResponse;
import com.rosales.prueba.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductControllerImpl {

    @Autowired
    private ProductService productService;

    @GetMapping("{productId}/similar")
    public ResponseEntity<List<ProductDetailResponse>> listSimilarProduct(@PathVariable("productId") String productId) {
        return new ResponseEntity<>(productService.listSimilarProduct(productId), HttpStatus.OK);
    }

}
