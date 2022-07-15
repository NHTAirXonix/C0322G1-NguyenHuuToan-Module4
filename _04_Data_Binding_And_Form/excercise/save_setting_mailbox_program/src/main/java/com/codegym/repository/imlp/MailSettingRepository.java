package com.codegym.repository.imlp;

import com.codegym.model.MailSettings;
import com.codegym.repository.IMailSettingRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MailSettingRepository implements IMailSettingRepository {
    static List<MailSettings> mailSettingsList = new ArrayList<>();
    String[] pageSize = new String[]{"5", "10", "15", "25", "50", "100"};
    String[] languages = new String[]{"English", "Vietnamese", "Japanese", "Chinese"};

    static {
        mailSettingsList.add(new MailSettings("1","English", "10", true, "Thunder Storm"));
        mailSettingsList.add(new MailSettings("2","Vietnamese", "50", false, "Thunder Lightning"));
    }

    @Override
    public List<MailSettings> getAll() {
        return mailSettingsList;
    }

    @Override
    public void save(MailSettings mailSettings) {
        mailSettingsList.add(mailSettings);
    }

    @Override
    public void update(MailSettings mailSettings) {
        for (int i =0; i < mailSettingsList.size();i++){
            if (mailSettings.getId().equals(mailSettingsList.get(i).getId())){
                mailSettingsList.get(i).setLanguages(mailSettings.getLanguages());
                mailSettingsList.get(i).setPageSize(mailSettings.getPageSize());
                mailSettingsList.get(i).setSignature(mailSettings.getSignature());
                mailSettingsList.get(i).setSpamFilter(mailSettings.isSpamFilter());
            }
        }
    }

    @Override
    public MailSettings findById(String id) {
        MailSettings mailSettings = new MailSettings();
        for (int i =0; i < mailSettingsList.size();i++){
            if (id.equals(mailSettingsList.get(i).getId())){
                mailSettings = mailSettingsList.get(i);
            }
        }
        return mailSettings;
    }

    @Override
    public String[] getPageSize() {
        return pageSize;
    }

    @Override
    public String[] getLanguage() {
        return languages;
    }
}


