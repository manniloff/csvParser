package com.csvparser.controller;

import com.csvparser.service.CsvService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller("csv-controller")
@RequiredArgsConstructor
public class CsvController {

    private final CsvService csvService;

    @RequestMapping(value = {"/", ""})
    public String hello(){
        return "hello.html";
    }

    @GetMapping("/uploadFile")
    public String uploadFile() {
        return "uploadFile.html";
    }
}
