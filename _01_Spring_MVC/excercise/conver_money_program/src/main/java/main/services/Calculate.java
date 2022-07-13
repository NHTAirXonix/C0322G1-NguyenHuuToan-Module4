package main.services;

import org.springframework.stereotype.Service;

@Service
public class Calculate implements ICalculate {
    @Override
    public Double calculate(Double input) {
        return input * 23000;
    }
}
