package com.brand;

public class Brand {
    private String name;
    private String model;
    private Integer year;
    private String identifierNumber;

    public Brand(String name, String model, Integer year, String identifierNumber) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.identifierNumber = identifierNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getIdentifierNumber() {
        return identifierNumber;
    }

    public void setIdentifierNumber(String identifierNumber) {
        this.identifierNumber = identifierNumber;
    }
}
