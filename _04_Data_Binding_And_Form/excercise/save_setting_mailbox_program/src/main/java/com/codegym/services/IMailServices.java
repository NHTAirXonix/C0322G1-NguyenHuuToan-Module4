package com.codegym.services;

import com.codegym.model.MailSettings;

import java.util.List;

public interface IMailServices {
    List<MailSettings> getAll();

    void save(MailSettings mailSettings);

    void update(MailSettings mailSettings);

    MailSettings findById(String id);

    String[] getPageSize();

    String[] getLanguage();

}
