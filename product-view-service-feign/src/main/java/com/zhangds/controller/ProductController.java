package com.zhangds.controller;

import com.zhangds.entities.Product;
import com.zhangds.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Create by zhangds
 * 2019-11-11 15:59
 **/
@Controller
public class ProductController {


    @Autowired
    ProductService productService;
    @Value("${version}")
    String version;

    @RequestMapping("/getAllProducts")
    public String products(Model model) {
        List<Product> ps = productService.listProducts();
        model.addAttribute("ps", ps);
        model.addAttribute("version", version);
        return "products";
    }
}
