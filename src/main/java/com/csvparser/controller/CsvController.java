package com.csvparser.controller;

import com.csvparser.service.CsvService;
import com.csvparser.service.impl.CsvParser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("csv-controller")
@RequiredArgsConstructor
public class CsvController {

    private final CsvService csvService;

    @GetMapping(value = {"/", ""})
    public String hello(){
        System.out.println("Hello");
        CsvParser csvParser = new CsvParser();
        csvService.createCsvList(csvParser.parseCsv());
        return "hello";
    }
}
