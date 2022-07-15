package com.codegym.controller;

import com.codegym.model.MailSettings;
import com.codegym.services.IMailServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
        model.addAttribute("mailSettings", new MailSettings());
        return "create";
    }

    @PostMapping(value = "/create")
    public String createMailSetting(@ModelAttribute("mailSettingsList") MailSettings mailSettings, RedirectAttributes redirectAttributes) {
        MailSettings mailSettings1 = new MailSettings(mailSettings.getLanguages(), mailSettings.getPageSize(), mailSettings.getSpamFilter(), mailSettings.getSignature());
        iMailServices.save(mailSettings1);
        redirectAttributes.addFlashAttribute("msg", "Create Success");
        return "redirect:/list";
    }
}
