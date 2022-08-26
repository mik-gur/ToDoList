package com.infoshareacademy.enums;

public enum Category {
    Home("Home"),
    Job("Job");

    private final String value;

    Category(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }

}
