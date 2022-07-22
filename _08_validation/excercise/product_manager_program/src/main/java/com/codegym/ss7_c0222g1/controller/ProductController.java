package com.codegym.ss7_c0222g1.controller;

import com.codegym.ss7_c0222g1.dto.ProductDto;
import com.codegym.ss7_c0222g1.model.Product;
import com.codegym.ss7_c0222g1.service.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("/list")
    public String list(@RequestParam(name = "page", defaultValue = "0") int page,
                       @RequestParam(name = "name", defaultValue = "") String name,
                       Product product,Model model) {
        Sort sort = Sort.by("product_id");
        Page<Product> productList = productService.searchByName(name,PageRequest.of(page, 3, sort));
        model.addAttribute("product", new Product());
        model.addAttribute("productList",productList);
        model.addAttribute("name",name);
        return "listProduct";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("productDto", new ProductDto());
        return "createProduct";
    }

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute("productDto") ProductDto productDto, BindingResult result) {
        if(result.hasErrors()) {
            return "createProduct";
        } else {
            Product product = new Product();
            BeanUtils.copyProperties(productDto,product);
            productService.save(product);
            return "redirect:/list";
        }
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "editProduct";
    }

    @PostMapping("/update")
    public String update(@Valid @ModelAttribute("product") Product product, BindingResult result) {
        if(result.hasErrors()) {
            return "editProduct";
        } else {
            productService.save(product);
            return "redirect:/list";
        }
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable String id, Model model) {
        productService.deleteById(id);
        return "redirect:/list";
    }

    @GetMapping("/view/{id}")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id).get());
        return "/viewProduct";
    }
}
