package com.creational.factory;

public class Server extends Computer {
    private String HDD;
    private String RAM;
    private String CPU;

    public Server(final String HDD, final String RAM, final String CPU) {
        this.HDD = HDD;
        this.RAM = RAM;
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
