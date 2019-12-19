package com.csvparser.service;

import com.csvparser.model.Csv;

import java.util.List;
import java.util.Optional;

public interface CsvService {
    List<Csv> getAll();

    Optional<Csv> getById(long id);

    long createOrUpdate(Csv newCsv);

    long deleteById(long id);

    void createCsvList(List<Csv> csvList);
}
