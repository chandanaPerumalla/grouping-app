package com.mavrck.assessment;

import com.mavrck.assessment.app.GroupingApp;
import com.mavrck.assessment.utils.ColumnNameMapper;
import org.apache.commons.cli.*;

import java.util.Arrays;
import java.util.Set;

public class GroupingEntry {

    private static Set<String> acceptedColumns = Set.of(
            ColumnNameMapper.COMPANY_NAME,
            ColumnNameMapper.CRUNCHBASE_URL,
            ColumnNameMapper.COMPANY_URL,
            ColumnNameMapper.OUTLET_TYPE,
            ColumnNameMapper.CATEGORY_GROUPS,
            ColumnNameMapper.CATEGORIES,
            ColumnNameMapper.HEADQUARTER_LOCATION,
            ColumnNameMapper.DESCRIPTION,
            ColumnNameMapper.CRUNCHBASE_RANK,
            ColumnNameMapper.TWITTER_URL,
            ColumnNameMapper.LINKEDIN_URL,
            ColumnNameMapper.FACEBOOK_URL,
            ColumnNameMapper.EMAIL,
            ColumnNameMapper.PHONE_NUMBER,
            ColumnNameMapper.NUMBER_OF_EMPLOYEES,
            ColumnNameMapper.STOCK_SYMBOL,
            ColumnNameMapper.STOCK_EXCHANGE
    );

    public static void main(String[] args) {
        CommandLine line = parseOptions(args);
        if (line.hasOption("file-path") && line.hasOption("columns") && validateColumns(line.getOptionValue("columns"))) {
            String filePath = line.getOptionValue("file-path");
            String[] columns = line.getOptionValue("columns").split(",");

            // The entry point for the application
            GroupingApp.run(filePath, columns);
        } else {
            help();
        }
    }

    private static CommandLine parseOptions(String[] args) {
        Options options = getOptions();
        CommandLine line = null;
        CommandLineParser parser = new DefaultParser();

        try {
            line = parser.parse(options, args);

        } catch (ParseException ex) {
            System.err.println("Failed to parse command line arguments");
            System.err.println(ex.toString());
            help();
            System.exit(1);
        }

        return line;
    }

    private static Options getOptions() {
        Options options = new Options();
        options.addOption("f", "file-path", true, "File name to load data from");
        options.addOption("g", "columns", true, "Comma separated string of grouping column names.\n" +
                "Accepted values for columns: Company Name, Crunchbase URL, url, Outlet Type, Category Groups, Categories, Headquarters, Description, Crunchbase Rank, Twitter, LinkedIn, Facebook, Contact Email, Phone Number, Number of Employees, Stock Symbol, Stock Exchange");
        return options;
    }

    private static void help() {
        Options options = getOptions();
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("GroupingEntry", options, true);
    }

    private static boolean validateColumns(String columnsString) {
        String[] columns = columnsString.split(",");
        return Arrays.stream(columns).allMatch(column -> acceptedColumns.contains(column));
    }
}
