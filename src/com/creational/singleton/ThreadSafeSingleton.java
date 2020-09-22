package com.creational.singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton () {}

    // In this performance is not good, because the getInstance is synchronized every time accessed.
    // We need synchronized only for initial few threads.
    /*private static synchronized ThreadSafeSingleton getInstance () {
        if( instance == null ) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }*/

    public static ThreadSafeSingleton getInstance () {
        if(instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
