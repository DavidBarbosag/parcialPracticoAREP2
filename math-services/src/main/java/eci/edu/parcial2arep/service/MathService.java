package eci.edu.parcial2arep.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MathService {
    public Map<String, Object> lucasSequence(int value) {
        if(value < 2){
            return Map.of("operation :", "Secuencia de Lucas", "input :", "value", "output", "input not valid");
        }

        int l0 = 2;
        int l1 = 1;
        int acum = 0;

        for (int i = 2; i < value; i++) {
            acum = l0 + l1;
            l0 = l1;
            l1 = acum;
        }

        return Map.of("operation :", "Secuencia de Lucas", "input :", "value", "output", acum);
    }
}
