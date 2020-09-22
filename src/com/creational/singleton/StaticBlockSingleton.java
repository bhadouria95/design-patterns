package com.creational.singleton;

public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton () {}

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Instance is already present");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}