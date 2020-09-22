package com.creational.factory;

public class FactoryMainDemo {
    public static void main(String[] args) {
        Computer PC = ComputerFactory.getComputer("PC", "500GB", "8GB", "1.5Ghz");
        Computer Server = ComputerFactory.getComputer("Server", "5000GB", "50GB", "4.5Ghz");

        System.out.println(PC.toString());
        System.out.println(Server.toString());
    }
}
