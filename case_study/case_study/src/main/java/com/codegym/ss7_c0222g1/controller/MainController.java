package com.codegym.ss7_c0222g1.controller;

import com.codegym.ss7_c0222g1.util.WebUtils;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Controller
public class MainController {

    @GetMapping({"/", "/home"})
    public String index() {
        return "home";
    }

    @GetMapping("/admin")
    public String showAdminPage() {
        return "/login/admin";
    }

    @GetMapping("/myLogin")
    public String showLogin() {
        return "/login/myLogin";
    }

    @GetMapping("/403")
    public String showAccessDenied() {
        return "/login/403";
    }
}
