package com.codegym.ss7_c0222g1.controller;

import com.codegym.ss7_c0222g1.model.Book;
import com.codegym.ss7_c0222g1.model.OderBook;
import com.codegym.ss7_c0222g1.service.IBookService;
import com.codegym.ss7_c0222g1.service.IOderBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.concurrent.ThreadLocalRandom;

@Controller
public class BookController {

    @Autowired
    private IBookService bookService;

    @Autowired
    private IOderBookService iOderBookService;

    @GetMapping("/list")
    public String list(@RequestParam(name = "page", defaultValue = "0") int page, Book book, Model model) {
        Sort sort = Sort.by("book_id");
        Page<Book> bookList = bookService.findAll(PageRequest.of(page, 3, sort));
        model.addAttribute("product", new Book());
        model.addAttribute("bookList", bookList);
        return "listBook";
    }

    @GetMapping("/borrow/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("book", bookService.findById(id));
        return "borrowBook";
    }

    @PostMapping("/update")
    public String update(@Valid @ModelAttribute("product") Book book) {
            bookService.borrow(book);
            return "redirect:/list";
    }

    @GetMapping("/return/{id}")
    public String showFormReturn(@PathVariable Integer id,Model model) {
        String random = "" + ThreadLocalRandom.current().nextInt(9999, 100000 + 1);
        model.addAttribute("book", bookService.findById(id));
        model.addAttribute("code", random);
        return "returnBook";
    }

    @PostMapping("/returnBookPost")
    public String returnBookPost(@Valid @ModelAttribute("book") Book book) {

        bookService.returns(book);
        return "redirect:/list";
    }
}
