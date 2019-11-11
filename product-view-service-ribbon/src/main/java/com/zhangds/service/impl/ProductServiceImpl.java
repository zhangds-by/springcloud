package com.zhangds.service.impl;

import com.zhangds.beans.ProductClientRibbon;
import com.zhangds.entities.Product;
import com.zhangds.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Create by zhangds
 * 2019-11-11 13:00
 **/
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductClientRibbon productClientRibbon;

    @Override
    public List<Product> listProducts() {
        return productClientRibbon.listProducts();
    }
}
