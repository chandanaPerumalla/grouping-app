package com.mavrck.assessment.beans;

public class Record {

    private String companyName;
    private String crunchbaseUrl;
    private String companyUrl;
    private String outletType;
    private String categoryGroups;
    private String categories;
    private String headQuarterLocation;
    private String description;
    private String crunchBaseRank;
    private String twitterUrl;
    private String linkedinUrl;
    private String facebookUrl;
    private String email;
    private String phoneNumber;
    private String numberOfEmployees;
    private String stockSymbol;
    private String stockExchange;


    public Record(String[] record){
            this.companyName = record[0];
            this.crunchbaseUrl = record[1];
            this.companyUrl = record[2];
            this.outletType = record[3];
            this.categoryGroups = record[4];
            this.categories = record[5];
            this.headQuarterLocation = record[6];
            this.description = record[7];
            this.crunchBaseRank = record[8];
            this.twitterUrl = record[9];
            this.facebookUrl = record[10];
            this.linkedinUrl = record[11];
            this.email = record[12];
            this.phoneNumber = record[13];
            this.numberOfEmployees = record[14];
            this.stockSymbol = record[15];
            this.stockExchange = record[16];
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCrunchbaseUrl() {
        return crunchbaseUrl;
    }

    public void setCrunchbaseUrl(String crunchbaseUrl) {
        this.crunchbaseUrl = crunchbaseUrl;
    }

    public String getCompanyUrl() {
        return companyUrl;
    }

    public void setCompanyUrl(String companyUrl) {
        this.companyUrl = companyUrl;
    }

    public String getOutletType() {
        return outletType;
    }

    public void setOutletType(String outletType) {
        this.outletType = outletType;
    }

    public String getCategoryGroups() {
        return categoryGroups;
    }

    public void setCategoryGroups(String categoryGroups) {
        this.categoryGroups = categoryGroups;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getHeadQuarterLocation() {
        return headQuarterLocation;
    }

    public void setHeadQuarterLocation(String headQuarterLocation) {
        this.headQuarterLocation = headQuarterLocation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCrunchBaseRank() {
        return crunchBaseRank;
    }

    public void setCrunchBaseRank(String crunchBaseRank) {
        this.crunchBaseRank = crunchBaseRank;
    }

    public String getTwitterUrl() {
        return twitterUrl;
    }

    public void setTwitterUrl(String twitterUrl) {
        this.twitterUrl = twitterUrl;
    }

    public String getLinkedinUrl() {
        return linkedinUrl;
    }

    public void setLinkedinUrl(String linkedinUrl) {
        this.linkedinUrl = linkedinUrl;
    }

    public String getFacebookUrl() {
        return facebookUrl;
    }

    public void setFacebookUrl(String facebookUrl) {
        this.facebookUrl = facebookUrl;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(String numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    public String getStockExchange() {
        return stockExchange;
    }

    public void setStockExchange(String stockExchange) {
        this.stockExchange = stockExchange;
    }
}
