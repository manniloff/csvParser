package com.csvparser.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller("csv-controller")
@RequiredArgsConstructor
public class CsvController {

    @RequestMapping(value = {"/", ""})
    public String uploadFile() {
        return "uploadFile.html";
    }
}
