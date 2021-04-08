package com.mavrck.assessment.utils;

import com.mavrck.assessment.beans.Record;

import java.util.NoSuchElementException;

public class ColumnNameMapper {

    public static final String COMPANY_NAME = "Company Name";
    public static final String CRUNCHBASE_URL = "Crunchbase URL";
    public static final String COMPANY_URL = "url";
    public static final String OUTLET_TYPE = "Outlet Type";
    public static final String CATEGORY_GROUPS = "Category Groups";
    public static final String CATEGORIES = "Categories";
    public static final String HEADQUARTER_LOCATION = "Headquarters";
    public static final String DESCRIPTION = "Description";
    public static final String CRUNCHBASE_RANK = "Crunchbase Rank";
    public static final String TWITTER_URL = "Twitter";
    public static final String LINKEDIN_URL = "LinkedIn";
    public static final String FACEBOOK_URL = "Facebook";
    public static final String EMAIL = "Contact Email";
    public static final String PHONE_NUMBER = "Phone Number";
    public static final String NUMBER_OF_EMPLOYEES = "Number of Employees";
    public static final String STOCK_SYMBOL = "Stock Symbol";
    public static final String STOCK_EXCHANGE = "Stock Exchange";


    public static String getValueForColumn(String columnName, Record record) {
        switch (columnName) {
            case COMPANY_NAME:
                return record.getCompanyName();
            case CRUNCHBASE_URL:
                return record.getCrunchbaseUrl();
            case COMPANY_URL:
                return record.getCompanyUrl();
            case OUTLET_TYPE:
                return record.getOutletType();
            case CATEGORY_GROUPS:
                return record.getCategoryGroups();
            case CATEGORIES:
                return record.getCategories();
            case HEADQUARTER_LOCATION:
                return record.getHeadQuarterLocation();
            case DESCRIPTION:
                return record.getDescription();
            case CRUNCHBASE_RANK:
                return record.getCrunchBaseRank();
            case TWITTER_URL:
                return record.getTwitterUrl();
            case LINKEDIN_URL:
                return record.getLinkedinUrl();
            case FACEBOOK_URL:
                return record.getFacebookUrl();
            case EMAIL:
                return record.getEmail();
            case PHONE_NUMBER:
                return record.getPhoneNumber();
            case NUMBER_OF_EMPLOYEES:
                return record.getNumberOfEmployees();
            case STOCK_SYMBOL:
                return record.getStockSymbol();
            case STOCK_EXCHANGE:
                return record.getStockExchange();
            default:
                throw new NoSuchElementException();
        }
    }
}
