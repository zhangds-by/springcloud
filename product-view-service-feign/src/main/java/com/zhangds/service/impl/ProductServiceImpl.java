package com.zhangds.service.impl;

import com.zhangds.beans.ProductClientFeign;
import com.zhangds.entities.Product;
import com.zhangds.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by zhangds
 * 2019-11-11 15:57
 **/
@Service
public class ProductServiceImpl implements ProductService {

    @Value("${server.port}")
    private String port;


    @Autowired
    private ProductClientFeign productClientFeign;
    @Override
    public List<Product> listProducts() {
        return productClientFeign.getAllProducts();
    }
}
