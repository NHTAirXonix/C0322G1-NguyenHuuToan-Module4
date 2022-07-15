package com.codegym.services.impl;

import com.codegym.model.MailSettings;
import com.codegym.repository.IMailSettingRepository;
import com.codegym.services.IMailServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MailService implements IMailServices {
    @Autowired
    private IMailSettingRepository iMailSettingRepository;

    @Override
    public List<MailSettings> getAll() {
        return iMailSettingRepository.getAll();
    }

    @Override
    public void save(MailSettings mailSettings) {
        iMailSettingRepository.save(mailSettings);
    }

    @Override
    public void update(MailSettings mailSettings) {
        iMailSettingRepository.update(mailSettings);
    }

    @Override
    public MailSettings findById(String id) {
        return iMailSettingRepository.findById(id);
    }

    @Override
    public String[] getPageSize() {
        return iMailSettingRepository.getPageSize();
    }

    @Override
    public String[] getLanguage() {
        return iMailSettingRepository.getLanguage();
    }


}
