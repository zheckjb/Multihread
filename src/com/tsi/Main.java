package com.tsi;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Main {
    private static final NumberCollector collector = new NumberCollector();
    //private Semaphore semaphore = new Semaphore(5)
    public static void main(String[] args) {
        for (int i = 0; i < 300; i++) {
            Thread thread = new Thread(Main::genRandom);
            thread.start();
        }
    }

    private static void genRandom (){
        Random random = new Random();

        for (int i = 0; i < 5000; i++) {
            collector.add(random.nextInt());
        }

    }
}
