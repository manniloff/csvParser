package com.csvparser.controller;

import com.csvparser.service.impl.CsvParser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("csv-controller")
public class CsvController {

    @GetMapping(value = {"/", ""})
    public String hello(){
        System.out.println("Hello");
        CsvParser csvParser = new CsvParser();
        csvParser.csvFileParse();
        return "hello";
    }
}
