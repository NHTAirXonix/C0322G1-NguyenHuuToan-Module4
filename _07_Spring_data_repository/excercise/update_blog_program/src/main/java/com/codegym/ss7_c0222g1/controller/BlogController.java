package com.codegym.ss7_c0222g1.controller;


import com.codegym.ss7_c0222g1.model.Blog;
import com.codegym.ss7_c0222g1.model.Category;
import com.codegym.ss7_c0222g1.service.IBlogService;
import com.codegym.ss7_c0222g1.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private IBlogService iBlogService;

    @Autowired
    private ICategoryService iCategoryService;

//    BLOG CONTROLLER

    @GetMapping("/list")
    public String index(@RequestParam(name = "page", defaultValue = "0") int page,
                        @RequestParam(name = "title", defaultValue = "") String title,
                        @RequestParam(name = "id", defaultValue = "") String id,
                        Model model) {
        Sort sort = Sort.by("create_day").ascending().and(Sort.by("blog_title"));
        List<Category> categories = iCategoryService.findAll();
        Page<Blog> blogList = iBlogService.findByTitleOfBlog(title, id, PageRequest.of(page, 2, sort));
        model.addAttribute("categoryList", categories);
        model.addAttribute("blogList", blogList);
        model.addAttribute("title", title);
        model.addAttribute("id", id);
        return "listBlog";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("blog", new Blog());
        model.addAttribute("listCategory", iCategoryService.findAll());
        return "createBlog";
    }

    @PostMapping("/save")
    public String save(Blog blog) {
        iBlogService.save(blog);
        return "redirect:/list";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("blog", iBlogService.findById(id));
        model.addAttribute("listCategory", iCategoryService.findAll());
        return "/editBlog";
    }

    @PostMapping("/update")
    public String update(Blog blog) {
        iBlogService.update(blog);
        return "redirect:/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("blog", iBlogService.findById(id));
        return "/deleteBlog";
    }

    @PostMapping("/delete")
    public String delete(Blog blog, RedirectAttributes redirect) {
        iBlogService.remove(blog.getIdBlog());
        redirect.addFlashAttribute("success", "Removed blog successfully!");
        return "redirect:/list";
    }

    @GetMapping("/view/{id}")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("blog", iBlogService.findById(id));
        return "/viewBlog";
    }

//    CATEGORY CONTROLLER

    @GetMapping("/showListCategory")
    public String showListCategory(Model model) {
        model.addAttribute("categoryList", iCategoryService.findAll());
        return "listCategory";
    }

    @GetMapping("/createCategory")
    public String createCategory(Model model) {
        model.addAttribute("category", new Category());
        return "createCategory";
    }

    @PostMapping("/saveCategory")
    public String saveCategory(Category category) {
        iCategoryService.save(category);
        return "redirect:/list";
    }

    @GetMapping("/editCategory/{id}")
    public String editCategory(@PathVariable Integer id, Model model) {
        model.addAttribute("category", iCategoryService.findById(id));
        return "/editCategory";
    }

    @PostMapping("/updateCategory")
    public String updateCategory(Category category) {
        iCategoryService.update(category);
        return "redirect:/showListCategory";
    }

    @GetMapping("/deleteCategory/{id}")
    public String deleteCategory(@PathVariable int id, Model model) {
        model.addAttribute("category", iCategoryService.findById(id));

        return "/deleteCategory";
    }

    @PostMapping("/deleteCategory")
    public String delete(Category category, RedirectAttributes redirect) {
        iBlogService.deleteByCategory(category.getId());
        iCategoryService.delete(category);
        return "redirect:/showListCategory";
    }
}
