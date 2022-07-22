package com.codegym.ss7_c0222g1.controller;

import com.codegym.ss7_c0222g1.dto.UserDto;
import com.codegym.ss7_c0222g1.model.User;
import com.codegym.ss7_c0222g1.service.IRegisterService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class RegisterController {
    @Autowired
    private IRegisterService iRegisterService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("userList", iRegisterService.findAll());
        return "registerList";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("userDto", new UserDto());
        return "registerForm";
    }

    @PostMapping("/save")
    public String save(@Validated UserDto userDto, BindingResult result) {

        if (result.hasFieldErrors()){
            return "registerForm";
        } else {
            User user = new User();
            BeanUtils.copyProperties(userDto,user);
            iRegisterService.save(user);
            return "redirect:/list";
        }
    }
}
