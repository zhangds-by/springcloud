package com.zhangds.controller;

import com.zhangds.entities.Product;
import com.zhangds.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Create by zhangds
 * 2019-11-11 13:03
 **/
@Controller
public class ProducerController {

    @Autowired
    ProductService productService;

    @RequestMapping("/productList")
    public String products(Model m) {
        List<Product> ps = productService.listProducts();
        m.addAttribute("ps", ps);
        return "products";
    }
}
