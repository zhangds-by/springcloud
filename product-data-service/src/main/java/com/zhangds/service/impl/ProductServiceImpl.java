package com.zhangds.service.impl;

import com.zhangds.entities.Product;
import com.zhangds.service.ProductService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by zhangds
 * 2019-11-11 11:17
 **/
@Service
public class ProductServiceImpl implements ProductService {

    @Value("${server.port}")
    private String port;

    @Override
    public List<Product> listProducts() {
        List<Product> ps = new ArrayList<>();
        ps.add(new Product(1,"product a from port:"+port, 50));
        ps.add(new Product(2,"product b from port:"+port, 150));
        ps.add(new Product(3,"product c from port:"+port, 250));
        return ps;
    }
}
