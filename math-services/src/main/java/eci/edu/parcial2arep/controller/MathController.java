package eci.edu.parcial2arep.controller;

import eci.edu.parcial2arep.service.MathService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class MathController {

    private final MathService mathService;

    public MathController(MathService mathService) {
        this.mathService = mathService;
    }

    @GetMapping("/lucasseq")
    public Map<Integer, Object> lucasSequence(@RequestParam int value) {
        return mathService.lucasSequence(value);
    }
}