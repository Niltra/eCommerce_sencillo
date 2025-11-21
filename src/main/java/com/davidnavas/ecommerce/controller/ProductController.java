package com.davidnavas.ecommerce.controller;


import com.davidnavas.ecommerce.model.Product;
import com.davidnavas.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public String findAll(Model model){
        model.addAttribute("products", productRepo.findAll());
        return "products_list";
    }

    @PostMapping("/products/new")
    public String submit(@ModelAttribute Product product,
                         @RequestParam("file") MultipartFile file) {
        if(!file.isEmpty()){
            String image = storageService.stroe(file);
            product.setImage(im);
        }
        productRepo.save(product);
        return "product_form";
    }


}
