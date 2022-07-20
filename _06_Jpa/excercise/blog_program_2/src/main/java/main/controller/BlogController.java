package main.controller;

import main.model.Blog;
import main.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private IBlogService iBlogService;

    @GetMapping("/list")
    public String index(Model model) {
        List<Blog> blogList = iBlogService.findAll();
        model.addAttribute("blog", new Blog());
        model.addAttribute("blogList", blogList);
        return "listBlog";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("blog", new Blog());
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
        return "/editBlog";
    }

    @PostMapping("/update")
    public String update(Blog blog) {
        iBlogService.update(blog);
        return "redirect:/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id, Model model) {
        iBlogService.remove(id);
        return "redirect:/list";
    }

    @GetMapping("/view/{id}")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("blog", iBlogService.findById(id));
        return "/viewBlog";
    }
}
