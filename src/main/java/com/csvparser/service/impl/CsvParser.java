package com.csvparser.service.impl;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.util.Map;

public class CsvParser {

    String csvFile = "C:\\Users\\sl\\Downloads\\interview.csv";
    BufferedReader br = null;
    String line = "";
    String cvsSplitBy = ",";


    public void csvFileParse() {

        CSVParser parser = null;
        try {
            parser = CSVParser.parse(csvFile, CSVFormat.RFC4180);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (CSVRecord csvRecord : parser) {
            System.out.println(csvRecord.getRecordNumber());
            Map<String,String> csvMap = csvRecord.toMap();
            System.out.println(csvRecord);
            csvMap.forEach((key,value) -> System.out.println(key + " --- " + value));
        }

    }
}
