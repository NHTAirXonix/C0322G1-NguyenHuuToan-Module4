package main.repository;

import org.springframework.stereotype.Repository;

import java.util.LinkedHashMap;
import java.util.Map;

@Repository
public class DictionaryRepository implements IDictionaryRepository {
    static Map<String, String> dictionaryMap = new LinkedHashMap<>();

    static {
        dictionaryMap.put("xin chao", "hello");
        dictionaryMap.put("xin loi", "sorry");
        dictionaryMap.put("cam on", "thank");
        dictionaryMap.put("con cho", "dog");
        dictionaryMap.put("con meo", "cat");
    }

    @Override
    public Map<String, String> getData() {
        return dictionaryMap;
    }
}
