package com.zhangds.beans;

import com.zhangds.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Create by zhangds
 * 2019-11-11 12:12
 **/
@Component
public class ProductClientRibbon {
    //Ribbon 客户端， 通过 restTemplate 访问

    @Autowired
    RestTemplate restTemplate;

    public List<Product> listProducts(){
        return restTemplate.getForObject("http://PRODUCT-DATA-SERVICE/products",List.class);
    }
}
