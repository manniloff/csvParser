package com.csvparser.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvParseError {

    static public void logErrorCsvData(List<Object[]> errData){
        String fileName = "src/main/resources/csv/bad-data.csv";
        try(FileWriter writer = new FileWriter(fileName, false))
        {
            // запись всей строки
            errData.forEach(data -> {
                try {
                    for(int i= 0; i<data.length; i++){
                        if(data.length -1 != i){
                            writer.write(data[i].toString()+",");
                        } else{
                            writer.write(data[i].toString());
                        }
                    }
                    // запись по символам
                    writer.append('\n');

                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}

