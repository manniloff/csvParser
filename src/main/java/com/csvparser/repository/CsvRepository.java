package com.csvparser.repository;

import com.csvparser.model.Csv;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CsvRepository extends JpaRepository<Csv,Long> {
}
