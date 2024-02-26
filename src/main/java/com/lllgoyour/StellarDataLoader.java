package com.lllgoyour;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import java.util.*;

public class StellarDataLoader {

    public static void main(String[] args) throws IOException {
        String filename = "./data/I_239_selection.tsv";
        List<StellarBody> stellarData = new ArrayList<>();

        try (Reader reader = new FileReader(filename);
             CSVParser csvParser = new CSVParser(reader, CSVFormat.newFormat(';').withHeader())) {

            for (CSVRecord record : csvParser) {
                StellarBody stellarBody = new StellarBody();
                stellarBody.setHip(record.get("HIP"));
                stellarBody.setVmag(record.get("Vmag"));
                stellarBody.setRa(record.get("RA"));
                stellarBody.setDec(record.get("Dec"));
                stellarBody.setPlx(record.get("Plx"));
                stellarBody.setB_v(record.get("B-V"));
                stellarBody.setSpType(record.get("SpType"));

                stellarData.add(stellarBody);
            }
        }
    }
}
