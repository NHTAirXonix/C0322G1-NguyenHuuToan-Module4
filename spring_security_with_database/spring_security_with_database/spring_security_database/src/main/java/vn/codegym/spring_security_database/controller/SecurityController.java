package vn.codegym.spring_security_database.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {
    @GetMapping(value = {"/", "/home"})
    public String showHomePage() {
        return "home";
    }

    @GetMapping("/admin")
    public String showAdminPage() {
        return "admin";
    }

    @GetMapping("/myLogin")
    public String showLogin() {
        return "myLogin";
    }

    @GetMapping("/403")
    public String showAccessDenied() {
        return "403";
    }

}
