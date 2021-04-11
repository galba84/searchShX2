package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private static final String template = "Sh (%s) is : %f";

    @GetMapping("/findSh")
    public Responce findSh(@RequestParam(value = "value", defaultValue = "0") String value) {
        Calc calc = new Calc();
        double result = calc.findShA(Integer.parseInt(value));
        return new Responce( String.format(template, value, result));
    }
}