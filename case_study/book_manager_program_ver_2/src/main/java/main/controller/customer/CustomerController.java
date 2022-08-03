package main.controller.customer;


import main.model.customer.Customer;
import main.repository.customer.CustomerRepository;
import main.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
@Autowired
    private CustomerService customerService;

    @GetMapping("/")
    public String showList(Model model) {
//        model.addAttribute("customerList", customerService.findAll());
        return "home";
    }
}
