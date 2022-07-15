package com.codegym.controller;

import com.codegym.model.MedicalForm;
import com.codegym.services.MedicalFormServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class MedicalFormController {

    @Autowired
    private MedicalFormServices medicalFormServices;

    @GetMapping(value = "/list")
    public String getAllMailSetting(Model model) {
        List<MedicalForm> medicalFormList = medicalFormServices.getAll();
        model.addAttribute("medicalFormList", medicalFormList);
        return "list";
    }

    // CALL FORM CREATE

    @GetMapping(value = "/create")
    public String getFormCreate(Model model) {
        model.addAttribute("listYear", medicalFormServices.getYear());
        model.addAttribute("listGender", medicalFormServices.getGender());
        model.addAttribute("listCountry", medicalFormServices.getCountry());
        model.addAttribute("listVehicle", medicalFormServices.getVehicle());
        model.addAttribute("listCity", medicalFormServices.getCity());
        model.addAttribute("listDistrict", medicalFormServices.getDistrict());
        model.addAttribute("listWard", medicalFormServices.getWard());
        model.addAttribute("medicalForm", new MedicalForm());
        return "create";
    }

    // CALL METHOD SAVE

    @PostMapping(value = "/create")
    public String createMailSetting(@ModelAttribute("medicalForm") MedicalForm medicalForm, RedirectAttributes redirectAttributes) {
        medicalFormServices.save(medicalForm);
        redirectAttributes.addFlashAttribute("msg", "Create Success");
        return "redirect:/list";
    }

    // CALL FORM EDIT

    @GetMapping(value = "/edit/{id}")
    public String getFormEdit(@PathVariable String id, Model model) {
        model.addAttribute("listYear", medicalFormServices.getYear());
        model.addAttribute("listGender", medicalFormServices.getGender());
        model.addAttribute("listCountry", medicalFormServices.getCountry());
        model.addAttribute("listVehicle", medicalFormServices.getVehicle());
        model.addAttribute("listCity", medicalFormServices.getCity());
        model.addAttribute("listDistrict", medicalFormServices.getDistrict());
        model.addAttribute("listWard", medicalFormServices.getWard());
        model.addAttribute("medicalForm", medicalFormServices.findById(id));
        return "edit";
    }

    // CALL METHOD UPDATE

    @PostMapping(value = "/update")
    public String updateMailSetting(@ModelAttribute("medicalForm") MedicalForm medicalForm, RedirectAttributes redirectAttributes) {
        medicalFormServices.update(medicalForm.getId(), medicalForm);
        redirectAttributes.addFlashAttribute("msg", "Update Success");
        return "redirect:/list";
    }
}
