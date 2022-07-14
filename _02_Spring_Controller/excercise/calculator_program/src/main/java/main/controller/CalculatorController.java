package main.controller;

import main.services.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @Autowired
    private ICalculatorService dictionary;

    @GetMapping("/home")
    public String showList() {
        return "home";
    }

    @PostMapping("/home")
    public String greeting(String firstInput, String secondInput, String calculation, Model model) {
        model.addAttribute("firstInput", firstInput);
        model.addAttribute("secondInput", secondInput);
        model.addAttribute("result", dictionary.calculation(firstInput, secondInput, calculation));
        return "home";
    }
}
