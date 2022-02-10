package com.rosales.prueba.model.data;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ProductDetailResponse {

    private String id;
    private String name;
    private BigDecimal price;
    private Boolean availability;

}
