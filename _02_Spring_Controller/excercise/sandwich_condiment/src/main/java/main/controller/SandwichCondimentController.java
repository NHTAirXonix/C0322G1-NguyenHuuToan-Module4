package main.controller;

import main.services.ISandwichCondimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichCondimentController {
    @Autowired
    private ISandwichCondimentService dictionary;

    @GetMapping("/home")
    public String showList() {
        return "home";
    }

    @PostMapping("/home")
    public String greeting(@RequestParam(name = "listCondiment", required = false) String[] listCondiment, Model model) {
        model.addAttribute("listCondiment", dictionary.search(listCondiment));
        return "result";
    }
}
