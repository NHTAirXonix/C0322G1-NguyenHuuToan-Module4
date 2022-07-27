package com.codegym.ss7_c0222g1.controller;

import com.codegym.ss7_c0222g1.model.customer.Customer;
import com.codegym.ss7_c0222g1.service.customer.CustomerService;
import com.codegym.ss7_c0222g1.service.customer.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerTypeService customerTypeService;

    @GetMapping("/list")
    public String showList(@RequestParam(name = "page", defaultValue = "0") int page,
                           @RequestParam(name = "customerName", defaultValue = "") String customerName,
                           Model model) {
        Sort sort = Sort.by("customer_id");
        Page<Customer> customerList = customerService.searchByNameCustomer(customerName, PageRequest.of(page, 5, sort));
        model.addAttribute("customer", new Customer());
        model.addAttribute("customerList", customerList);
        model.addAttribute("customerName", customerName);
        return "/customer/CustomerList";
    }

    @GetMapping("/create")
    public String showCreateCustomer(Model model) {
        model.addAttribute("customer", new Customer());
        model.addAttribute("listCustomerType", customerTypeService.findAll());
        return "/customer/CustomerAdd";
    }

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute("customer") Customer customer, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("listCustomerType", customerTypeService.findAll());
            return "/customer/CustomerAdd";
        } else {
            customerService.save(customer);
            return "redirect:/customer/list";
        }
    }

    @GetMapping("/edit/{id}")
    public String showEditCustomer(@PathVariable String id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        model.addAttribute("listCustomerType", customerTypeService.findAll());
        return "/customer/CustomerEdit";
    }

    @PostMapping("/update")
    public String update(@Valid @ModelAttribute("customer") Customer customer, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("listCustomerType", customerTypeService.findAll());
            return "/customer/CustomerEdit";
        } else {
            customerService.save(customer);
            return "redirect:/customer/list";
        }
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable(name = "id") String id, RedirectAttributes redirectAttributes) {
        customerService.delete(id);
        return "redirect:/customer/list";
    }
}
