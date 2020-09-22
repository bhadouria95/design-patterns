package com.creational.singleton;

public class SingletonMainDemo {
    public static void main(String[] args) {
        final EagerInitializedSingleton eagerInitializedSingleton = EagerInitializedSingleton.getInstance();
        System.out.println(eagerInitializedSingleton);

        final LazyInitializedSingleton lazyInitializedSingleton = LazyInitializedSingleton.getInstance();
        System.out.println(lazyInitializedSingleton);

        final StaticBlockSingleton staticBlockSingleton = StaticBlockSingleton.getInstance();
        System.out.println(staticBlockSingleton);

        final ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
        System.out.println(threadSafeSingleton);
    }
}
