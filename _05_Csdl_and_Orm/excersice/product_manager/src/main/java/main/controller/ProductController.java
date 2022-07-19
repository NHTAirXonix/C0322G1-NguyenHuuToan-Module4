package main.controller;


import main.model.Product;
import main.service.IProductService;
import main.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private final IProductService productService = new ProductService();

    @GetMapping("/list")
    public String index(Model model) {
        List<Product> productList = productService.findAll();
        model.addAttribute("product", new Product());
        model.addAttribute("productList", productList);
        return "indexProduct";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "createProduct";
    }

    @PostMapping("/save")
    public String save(Product product) {
        productService.save(product);
        return "redirect:/list";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/editProduct";
    }

    @PostMapping("/update")
    public String update(Product product) {
        productService.update(product.getId(), product);
        return "redirect:/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/deleteProduct";
    }

    @PostMapping("/delete")
    public String delete(Product product, RedirectAttributes redirect) {
        productService.remove(product.getId());
        redirect.addFlashAttribute("success", "Removed product successfully!");
        return "redirect:/list";
    }

    @GetMapping("/view/{id}")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/viewProduct";
    }

    @GetMapping("/search")
    public String search(Product product, Model model) {
        model.addAttribute("productList", productService.searchByName(product));
        return "/indexProduct";
    }
}
