package main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import main.services.ICalculate;

@Controller
public class ProgramController {
    @Autowired
    private ICalculate addAttribute;

    @GetMapping("/home")
    public String showList() {
        return "home";
    }

    @PostMapping("/home")
    public String greeting(@RequestParam String amountMoney, Model model) {

        model.addAttribute("oldValue", amountMoney);
        try {
            model.addAttribute("newValue", addAttribute.calculate(Double.parseDouble(amountMoney)));
        } catch (NumberFormatException e) {
            model.addAttribute("newValue", "Wrong input");
        }
        return "home";
    }
}
