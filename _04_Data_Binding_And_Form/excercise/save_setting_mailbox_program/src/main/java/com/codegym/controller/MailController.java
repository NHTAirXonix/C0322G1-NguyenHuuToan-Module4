package com.codegym.controller;

import com.codegym.model.MailSettings;
import com.codegym.services.IMailServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class MailController {

    @Autowired
    private IMailServices iMailServices;

    @GetMapping(value = "/list")
    public String getAllMailSetting(Model model) {
        List<MailSettings> mailSettingsList = iMailServices.getAll();
        model.addAttribute("mailSettingsList", mailSettingsList);
        return "list";
    }

    @GetMapping(value = "/create")
    public String getFormCreate(Model model) {
        model.addAttribute("pageSizeList", iMailServices.getPageSize());
        model.addAttribute("languageList", iMailServices.getLanguage());
        model.addAttribute("mailSettings", new MailSettings());
        return "create";
    }

    @PostMapping(value = "/create")
    public String createMailSetting(@ModelAttribute("mailSettingsList") MailSettings mailSettings, RedirectAttributes redirectAttributes) {
        iMailServices.save(mailSettings);
        redirectAttributes.addFlashAttribute("msg", "Create Success");
        return "redirect:/list";
    }

    @GetMapping(value = "/edit/{id}")
    public String getFormEdit(@PathVariable String id, Model model) {
        model.addAttribute("pageSizeList", iMailServices.getPageSize());
        model.addAttribute("languageList", iMailServices.getLanguage());
        model.addAttribute("mailSettings", iMailServices.findById(id));
        return "edit";
    }

    @PostMapping(value = "/update")
    public String updateMailSetting(@ModelAttribute("mailSettingsList") MailSettings mailSettings, RedirectAttributes redirectAttributes) {
        iMailServices.update(mailSettings);
        redirectAttributes.addFlashAttribute("msg", "Update Success");
        return "redirect:/list";
    }
}
