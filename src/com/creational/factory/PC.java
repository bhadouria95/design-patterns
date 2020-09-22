package com.creational.factory;

public class PC extends Computer {
    private String RAM;
    private String HDD;
    private String CPU;

    public PC  (final String HDD, final String RAM, final String CPU) {
        this.RAM = RAM;
        this.HDD = HDD;
        this.CPU = CPU;
    }

    @Override
    public String getHDD() {
        return HDD;
    }

    @Override
    public String getRAM() {
        return RAM;
    }

    @Override
    public String getCPU() {
        return CPU;
    }
}
