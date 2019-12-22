package com.csvparser.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller("csv-controller")
@RequiredArgsConstructor
public class CsvController {

    @GetMapping(value = {"/", ""})
    public String uploadFile() {
        return "uploadFile.html";
    }
}
