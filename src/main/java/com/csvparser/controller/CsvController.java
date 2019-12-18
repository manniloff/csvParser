package com.csvparser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("csv-controller")
public class CsvController {

    @GetMapping(value = {"/", ""})
    public String hello(){
        System.out.println("Hello");
        return "hello";
    }
}
