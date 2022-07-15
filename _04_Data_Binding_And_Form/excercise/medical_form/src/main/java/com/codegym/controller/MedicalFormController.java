package com.codegym.controller;

import com.codegym.model.MedicalForm;
import com.codegym.services.MedicalFormServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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

    @PostMapping(value = "/create")
    public String createMailSetting(@ModelAttribute("medicalForm") MedicalForm medicalForm, RedirectAttributes redirectAttributes) {
        MedicalForm medicalForm1 = new MedicalForm(
                medicalForm.getName(),
                medicalForm.getBirthYear(),
                medicalForm.getGender(),
                medicalForm.getCountry(),
                medicalForm.getIdCardNumber(),
                medicalForm.getVerhice(),
                medicalForm.getVerhiceNumber(),
                medicalForm.getVerhiceNumberSlot(),
                medicalForm.getDayStart(),
                medicalForm.getDayEnd(),
                medicalForm.getCity(),
                medicalForm.getCity2(),
                medicalForm.getDistrict(),
                medicalForm.getWard(),
                medicalForm.getAddress(),
                medicalForm.getPhone(),
                medicalForm.getEmail(),
                medicalForm.getFever(),
                medicalForm.getVomit(),
                medicalForm.getCough(),
                medicalForm.getDiarrhea(),
                medicalForm.getDifficultyBreathing(),
                medicalForm.getBleeding(),
                medicalForm.getSoreThroat(),
                medicalForm.getRash(),
                medicalForm.getAnimalContact(),
                medicalForm.getPatientContact()
        );
        medicalFormServices.save(medicalForm1);
        redirectAttributes.addFlashAttribute("msg", "Create Success");
        return "redirect:/list";
    }
}
