package main.services;

import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class SandwichCondimentService implements ISandwichCondimentService {


    @Override
    public String[] search(String[] listCondiment) {
        String[] list;
        if (listCondiment != null) {
            list = listCondiment;
        } else {
            list = new String[]{"No Condiment !"};
        }
        return list;
    }
}
