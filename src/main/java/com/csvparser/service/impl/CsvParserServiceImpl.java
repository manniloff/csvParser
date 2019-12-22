package com.csvparser.service.impl;

import com.csvparser.model.Csv;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CsvParserServiceImpl {

    private int countG;
    private int countB;
    private String filePath;

    CsvParserServiceImpl(String filePath){
        this.filePath = filePath;
    }

    public List<Csv> parseCsv() {

        List<String[]> rows = readCsv();
        List<Csv> data = new ArrayList<>();
        List<Object[]> errData = new ArrayList<>();

        countG = 0;
        countB = 0;

        for (String[] row : rows) {
            Object[] csvData = Arrays.stream(row).toArray();
            if (row.length == 10) {
                Csv newCsv = new Csv();
                newCsv.setA((String) csvData[0]);
                newCsv.setB((String) csvData[1]);
                newCsv.setC((String) csvData[2]);
                newCsv.setD((String) csvData[3]);
                newCsv.setE((String) csvData[4]);
                newCsv.setF((String) csvData[5]);
                newCsv.setG((String) csvData[6]);
                newCsv.setH((String) csvData[7]);
                newCsv.setI((String) csvData[8]);
                newCsv.setJ((String) csvData[9]);

                data.add(newCsv);
                countG++;
            } else {
                errData.add(csvData);
                countB++;
            }
        }
        CsvParseErrorServiceImpl.logErrorCsvData(errData);
        return data;
    }

    private List<String[]> readCsv() {
        //String fileName = "src/main/resources/csv/interview.csv";
        Path myPath = Paths.get(filePath);
        List<String[]> rows = null;
        CSVParser parser = new CSVParserBuilder().withSeparator(',').build();

        try (BufferedReader br = Files.newBufferedReader(myPath,
                StandardCharsets.UTF_8);
             CSVReader reader = new CSVReaderBuilder(br).withCSVParser(parser)
                     .build()) {
            rows = reader.readAll();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return rows;
    }
}
