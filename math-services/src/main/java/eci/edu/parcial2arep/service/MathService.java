package eci.edu.parcial2arep.service;

import java.util.Arrays;
import java.util.Map;

public class MathService {


    public Map<String, Object> lucasSequence(int value) {

        int l0 = 2;
        int l1 = 1;
        int acum = 0;
        for (int i = 2; i < value; i++) {
            if(value >= 2)
                return Map.of("operation : Secuencia de Lucas", true, "value", i);

        }
        return Map.of("operation : Secuencia de Lucas", false, "value", -1);
    }


}
