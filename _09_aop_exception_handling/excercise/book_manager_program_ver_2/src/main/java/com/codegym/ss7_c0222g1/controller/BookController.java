package com.codegym.ss7_c0222g1.controller;


import com.codegym.ss7_c0222g1.model.User;
import com.codegym.ss7_c0222g1.service.BookService;
import com.codegym.ss7_c0222g1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.ThreadLocalRandom;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String goList(Model model) {
        model.addAttribute("books", bookService.findAll());
        return "/list";
    }

    @GetMapping("/borrow/{id}")
    public String borrowBook(@PathVariable Integer id, Model model) {
        if (bookService.updateDown(id) != null) {
            return "/error";
        }
        String random = "" + ThreadLocalRandom.current().nextInt(9999, 100000 + 1);
        model.addAttribute("book", bookService.findById(id));
        userService.addNew(new User(random, bookService.findById(id)));
        model.addAttribute("code", random);
        return "/detail";
    }

    @GetMapping("/give-back")
    public String giveback(String code) {
        if (userService.findByCode(code) == null) {
            return handlerException();
        }
        bookService.updateUp(userService.findByCode(code).getBook().getId());
        userService.delete(code);
        return "redirect:/";
    }

    @ExceptionHandler(Exception.class)
    public String handlerException() {
        return "existed";
    }
}
