package main.services;

import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class DictionaryService implements IDictionaryService {
    static Map<String, String> dictionaryMap = new LinkedHashMap<>();

    static {
        dictionaryMap.put("xin chao", "hello");
        dictionaryMap.put("xin loi", "sorry");
        dictionaryMap.put("cam on", "thank");
        dictionaryMap.put("con cho", "dog");
        dictionaryMap.put("con meo", "cat");
    }

    @Override
    public String search(String input) {
        if (dictionaryMap.get(input) != null) {
            return dictionaryMap.get(input);
        } else {
            return "Not excepted";
        }
    }
}
