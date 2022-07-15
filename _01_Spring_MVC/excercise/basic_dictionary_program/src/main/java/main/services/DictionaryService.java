package main.services;

import main.repository.DictionaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class DictionaryService implements IDictionaryService {
    @Autowired
    DictionaryRepository dictionaryRepository;

    @Override
    public String search(String input) {
        Map<String, String> dictionaryMap = dictionaryRepository.getData();
        if (dictionaryMap.get(input) != null) {
            return dictionaryMap.get(input);
        } else {
            return "Not excepted";
        }
    }
}
