package com.mavrck.assessment.utils;

import com.mavrck.assessment.beans.Record;
import com.univocity.parsers.csv.CsvFormat;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;

public class RecordParser {
    private static CsvParser parser = getParser();

    public static Record getRecord(String line) {
        return new Record(parser.parseLine(line));
    }

    private static CsvParser getParser() {
        CsvFormat format = new CsvFormat();
        format.setComment('\u0001');
        CsvParserSettings settings = new CsvParserSettings();
        settings.setFormat(format);
        settings.setNullValue("");
        settings.setEmptyValue("");
        return new CsvParser(settings);
    }
}
