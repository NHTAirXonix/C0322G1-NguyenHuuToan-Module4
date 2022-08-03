package com.codegym.ss7_c0222g1.controller;

import com.codegym.ss7_c0222g1.model.facility.Facility;
import com.codegym.ss7_c0222g1.service.customer.CustomerTypeService;
import com.codegym.ss7_c0222g1.service.service.RentTypeService;
import com.codegym.ss7_c0222g1.service.service.ServiceService;
import com.codegym.ss7_c0222g1.service.service.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/service")
public class ServiceController {
    @Autowired
    private ServiceService serviceService;

    @Autowired
    private CustomerTypeService customerTypeService;

    @Autowired
    private RentTypeService rentTypeService;

    @Autowired
    private ServiceTypeService serviceTypeService;


    @GetMapping("/list")
    public String showList(@RequestParam(name = "name", defaultValue = "") String name, Model model) {
        List<Facility> serviceList = serviceService.searchByName(name);
        model.addAttribute("service", new Facility());
        model.addAttribute("serviceList", serviceList);
        model.addAttribute("rentTypeList", rentTypeService.findAll());
        model.addAttribute("name", name);
        return "/service/ServiceList";
    }

    @GetMapping("/create")
    public String showCreateService(Model model) {
        model.addAttribute("facility", new Facility());
        model.addAttribute("rentTypeList", rentTypeService.findAll());
        model.addAttribute("facilityTypeList", serviceTypeService.findAll());
        return "/service/ServiceAdd";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable(name = "id") int id, RedirectAttributes redirectAttributes) {
        serviceService.delete(id);
        return "redirect:/service/list";
    }
}