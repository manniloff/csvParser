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

public class CsvParser {

    private int countG;
    private int countB;


    public List<Csv> parseCsv() {
        String fileName = "src/main/resources/csv/interview.csv";
        Path myPath = Paths.get(fileName);
        List<Csv> data = new ArrayList<>();

        CSVParser parser = new CSVParserBuilder().withSeparator(',').build();

        try (BufferedReader br = Files.newBufferedReader(myPath,
                StandardCharsets.UTF_8);
             CSVReader reader = new CSVReaderBuilder(br).withCSVParser(parser)
                     .build()) {

            List<String[]> rows = reader.readAll();

            countG = 0;
            countB = 0;

            for (String[] row : rows) {
                Object[] r = Arrays.stream(row).toArray();
                if (row.length == 10) {
                        Csv newCsv = new Csv();
                        newCsv.setA((String) r[0]);
                        newCsv.setB((String) r[1]);
                        newCsv.setC((String) r[2]);
                        newCsv.setD((String) r[3]);
                        newCsv.setE((String) r[4]);
                        newCsv.setF((String) r[5]);
                        newCsv.setG((String) r[6]);
                        newCsv.setH((String) r[7]);
                        newCsv.setI((String) r[8]);
                        newCsv.setJ((String) r[9]);

                        data.add(newCsv);
                    countG++;
                } else {
                    countB++;
                }

                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }
}
