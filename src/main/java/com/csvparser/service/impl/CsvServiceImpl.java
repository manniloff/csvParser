package com.csvparser.service.impl;

import com.csvparser.model.Csv;
import com.csvparser.repository.CsvRepository;
import com.csvparser.service.CsvService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CsvServiceImpl implements CsvService {

    private static final Logger logger = LoggerFactory.getLogger(CsvServiceImpl.class);
    private final CsvRepository csvRepository;

    @Override
    public List<Csv> getAll() {
        logger.debug("Get list of Csv Objects from database");
        return csvRepository.findAll();
    }

    @Override
    public Optional<Csv> getById(long id) {
        logger.debug("Get Csv Object from database with id - {}",id);
        return csvRepository.findById(id);
    }

    @Override
    public long createOrUpdate(Csv newCsv) {
        logger.debug("Add or Update Csv Object");
        return csvRepository.findById(newCsv.getId())
                .map(csv -> {
                    csv.setA(newCsv.getA());
                    csv.setB(newCsv.getB());
                    csv.setC(newCsv.getC());
                    csv.setD(newCsv.getD());
                    csv.setE(newCsv.getE());
                    csv.setF(newCsv.getF());
                    csv.setH(newCsv.getH());
                    csv.setI(newCsv.getI());
                    csv.setJ(newCsv.getJ());
                    return csvRepository.save(csv).getId();
                }).orElseGet(() -> {
                    Csv csv = new Csv();
                    csv.setA(newCsv.getA());
                    csv.setB(newCsv.getB());
                    csv.setC(newCsv.getC());
                    csv.setD(newCsv.getD());
                    csv.setE(newCsv.getE());
                    csv.setF(newCsv.getF());
                    csv.setH(newCsv.getH());
                    csv.setI(newCsv.getI());
                    csv.setJ(newCsv.getJ());
                    return csvRepository.save(csv).getId();
                });
    }

    @Override
    public void createCsvList(List<Csv> csvList) {
        logger.debug("Create list of Csv Objects");
        csvRepository.saveAll(csvList);
    }

    @Override
    public long deleteById(long id) {
        logger.debug("Delete Csv Object with id - {}", id);
        Optional<Csv> csv = csvRepository.findById(id);
        if(csv.isPresent()){
            csvRepository.deleteById(id);
        }
        return csv.get().getId();
    }

}
