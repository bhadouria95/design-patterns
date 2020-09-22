package com.creational.factory;

public class ComputerFactory {
    private ComputerFactory () {}
    public static Computer getComputer(String type, String HDD, String RAM, String CPU) {
        if ("PC".equalsIgnoreCase(type)) {
            return new PC(HDD, RAM, CPU);
        } else if ("Server".equalsIgnoreCase(type)) {
            return new Server(HDD, RAM, CPU);
        } else {
            return null;
        }
    }
}
