package com.csvparser.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class CsvParseErrorServiceImpl {

    private static final Logger logger = LoggerFactory.getLogger(CsvParseErrorServiceImpl.class);
    private static final Logger loggerCsvError = LoggerFactory.getLogger("csvError");

    static public void logErrorCsvData(List<Object[]> errData){
        final String[] errorInfo = {""};
            // запись всей строки
            errData.forEach(data -> {
                try {
                    for (int i = 0; i < data.length; i++) {
                        if (data.length - 1 != i) {
                            errorInfo[0] += (data[i].toString() + ",");
                        } else {
                            errorInfo[0] += (data[i].toString());
                        }
                    }
                    loggerCsvError.info(errorInfo[0]);
                } catch (Exception e) {
                    logger.error(e.getMessage());
                }
            });
    }
}

