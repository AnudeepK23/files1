package com.shopiffy.onlineshop.controller;

import com.shopiffy.onlineshop.global.GlobalData;
import com.shopiffy.onlineshop.service.CategoryService;
import com.shopiffy.onlineshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    @Autowired
    CategoryService categoryService;
    @Autowired
    ProductService productService;

    @GetMapping({"/", "/home"})
    public String home(Model model) {
        model.addAttribute("cartCount", GlobalData.cart.size());
        return "index";
    }

    @GetMapping("/shop")
    public String shop(Model model) {
        model.addAttribute("categories", categoryService.getAllCategory());
        model.addAttribute("products", productService.getAllProduct());
        model.addAttribute("cartCount",GlobalData.cart.size());
        return "shop";
    }

    @GetMapping("/shop/category/{id}")
    public String shopByCategory(Model model, @PathVariable int id) {
        System.out.println("hellloooo bruh its hitting hereee");
        model.addAttribute("categories", categoryService.getAllCategory());
        System.out.println("hello");
        model.addAttribute("products", productService.getAllProductsByCategoryId(id));
        System.out.println("sir");
        model.addAttribute("cartCount",GlobalData.cart.size());
        System.out.println("testt");
        return "shop";
    }

    @GetMapping("/shop/viewproduct/{id}")
    public String viewProduct(Model model, @PathVariable int id) {
        System.out.println("hellooooo bruhh");
        model.addAttribute("product", productService.getProductById(id).get());
        model.addAttribute("cartCount",GlobalData.cart.size());
        return "viewProduct";
    }

    @GetMapping("/cart/removeItem/{index}")
        public String cartItemRemove(@PathVariable int index) {
        GlobalData.cart.remove(index);
        return "redirect:/cart";
    }

    //my new code stats here
    @GetMapping("/shop/viewSpecs/{id}")
    public String viewSpecs(Model model, @PathVariable int id){
        model.addAttribute("categories",categoryService.getAllCategory());
        model.addAttribute("allproducts", productService.getAllProduct());
        model.addAttribute("product", productService.getProductById(id).get());
        model.addAttribute("cartCount",GlobalData.cart.size());
        return "viewSpecs";
    }

}
