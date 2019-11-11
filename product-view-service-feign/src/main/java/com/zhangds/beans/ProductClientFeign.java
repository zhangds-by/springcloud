package com.zhangds.beans;

import com.zhangds.entities.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Create by zhangds
 * 2019-11-11 15:48
 **/
@FeignClient(value = "PRODUCT-DATA-SERVICE")
public interface ProductClientFeign {

    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts();
}
