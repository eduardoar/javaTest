package com.rosales.prueba.client;

import com.rosales.prueba.model.data.ProductDetailResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "ProductMock", url = "${gateway}")
public interface ProductMockClient {

    @GetMapping(value = "${client.similarIds}")
    List<String> listSimilarIdsProduct(@PathVariable String productId);

    @GetMapping(value = "${client.productDetail}")
    ProductDetailResponse searchProductDetail(@PathVariable String productId);

}
