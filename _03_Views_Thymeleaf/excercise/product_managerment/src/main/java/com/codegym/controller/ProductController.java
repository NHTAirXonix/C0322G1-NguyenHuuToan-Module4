package com.codegym.controller;


import com.codegym.model.Product;
import com.codegym.repository.IProductRepository;
import com.codegym.repository.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    private final IProductRepository iProductRepository = new ProductRepository();

    @GetMapping("")
    public String index(Model model) {
        List<Product> productList = iProductRepository.findAll();
        model.addAttribute("product", new Product());
        model.addAttribute("productList", productList);
        return "/indexProduct";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "/createProduct";
    }

    @PostMapping("/save")
    public String save(Product product, RedirectAttributes redirect) {
        iProductRepository.save(product);
        redirect.addFlashAttribute("success", "Add New product successfully!");
        return "redirect:/product";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("product", iProductRepository.findById(id));
        return "/editProduct";
    }

    @PostMapping("/update")
    public String update(Product product, RedirectAttributes redirect) {
        iProductRepository.update(product.getId(), product);
        redirect.addFlashAttribute("success", "Update product successfully!");
        return "redirect:/product";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("product", iProductRepository.findById(id));
        return "/deleteProduct";
    }

    @PostMapping("/delete")
    public String delete(Product product, RedirectAttributes redirect) {
        iProductRepository.remove(product.getId());
        redirect.addFlashAttribute("success", "Removed product successfully!");
        return "redirect:/product";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("product", iProductRepository.findById(id));
        return "/viewProduct";
    }

    @GetMapping("/search")
    public String search(Product product, Model model) {
        model.addAttribute("productList", iProductRepository.searchByName(product));
        model.addAttribute("success", "Search complete");
        return "/indexProduct";
    }
}
