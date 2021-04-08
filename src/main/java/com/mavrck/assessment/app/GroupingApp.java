package com.mavrck.assessment.app;

import com.mavrck.assessment.beans.Record;
import com.mavrck.assessment.utils.ColumnNameMapper;
import com.mavrck.assessment.utils.RecordParser;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class GroupingApp {
    /***
     * groups the data by given list of columns and print the results
     * @param filePath : input file path
     * @param columnNames : list of column names
     */

    public static void run(String filePath, String[] columnNames) {
        try {
            Stream<Record> inputLineStream = getLineStream(filePath).map(RecordParser::getRecord).skip(1);

            // Group by provided columns and get count
            Map<List<String>, Long> counts = inputLineStream
                    .collect(Collectors.groupingBy(record -> getColumnValuesList(columnNames, record), Collectors.counting()));

            // Transform counts to the expected output format
            List<List<String>> output = counts.keySet().stream()
                    .map(x -> {
                        List<String> dataWithCount = new ArrayList<>();
                        dataWithCount.addAll(x);
                        dataWithCount.add(counts.get(x).toString());
                        return dataWithCount;
                    }).collect(Collectors.toList());

            output.forEach(count -> System.out.println(count));
        } catch (IOException e) {
            System.err.println("Couldn't read the provided file");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private static List<String> getColumnValuesList(String[] fieldNames, Record record) {
        return Arrays.stream(fieldNames)
                .map(fieldName -> ColumnNameMapper.getValueForColumn(fieldName, record))
                .collect(Collectors.toList());
    }


    /***
     *
     * Reads the given file and return the file stream in lines
     * @param filePath
     * @return stream
     * @throws IOException
     */
    private static Stream<String> getLineStream(String filePath) throws IOException {
        File inputFile = new File(filePath);
        InputStream fileInputStream = new FileInputStream(inputFile);
        BufferedReader bufferedReader = new BufferedReader(new java.io.InputStreamReader(fileInputStream));
        return bufferedReader.lines();
    }
}