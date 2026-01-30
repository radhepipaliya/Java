package com.qspider.ConstructorOverloading;

public class AirConditional {
    String name;
    String model;
    double tone;
    boolean inverter;
    boolean smart;
    boolean split;
    int salary;

    public AirConditional() {
    }

    public AirConditional(String name, String model, double tone, boolean inverter, boolean smart, boolean split, int salary) {
        this.name = name;
        this.model = model;
        this.tone = tone;
        this.inverter = inverter;
        this.smart = smart;
        this.split = split;
        this.salary = salary;
    }
}