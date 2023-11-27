package com.example.ex02.domain.vo;


import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ProductVO {
    String productName;
    int productPrice;
    int productStock;
    String brand;
}
