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
    static Map<String, MailSettings> mailList = new LinkedHashMap<>();
    static List<MailSettings> mailSettingsList = new ArrayList<>();
    String[] pageSize = new String[]{"5", "10", "15", "25", "50", "100"};
    String[] languages = new String[]{"English", "Vietnamese", "Japanese", "Chinese"};

    static {
        mailList.put("1", new MailSettings("English", "10", true, "Thunder Storm"));
        mailList.put("2", new MailSettings("Vietnamese", "50", false, "Thunder Lightning"));
    }

    static {
        mailSettingsList.add(new MailSettings("English", "10", true, "Thunder Storm"));
        mailSettingsList.add(new MailSettings("Vietnamese", "50", false, "Thunder Lightning"));
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
    public Map<String, MailSettings> getData() {
        return mailList;
    }
}


