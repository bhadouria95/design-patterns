package com.creational.builder;

public class TestComputerMain {
    public static void main(String[] args) {
        final Computer myComputer = new Computer.ComputerBuilder("500", "16").setGraphicCardEnabled(true).setBluetoothEnabled(true).build();
        final Computer myServer = new Computer.ComputerBuilder("5000", "50").build();
        System.out.println(myComputer.toString());
        System.out.println(myServer.toString());
    }
}
