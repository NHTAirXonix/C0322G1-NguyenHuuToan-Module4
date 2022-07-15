package com.codegym.repository;

import com.codegym.model.MailSettings;

import java.util.List;
import java.util.Map;

public interface IMailSettingRepository {
    List<MailSettings> getAll();

    void save(MailSettings mailSettings);

    void update(MailSettings mailSettings);

    MailSettings findById(String id);

    String[] getPageSize();

    String[] getLanguage();
}
