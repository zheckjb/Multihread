package com.tsi;

/**
 * Created by Javacourses on 17.05.2017..
 */
public class MyThread extends Thread {
    private String id;

    public MyThread(String id) {
        this.id = id;
    }

    @Override
    public void run() {


        for (int i = 0; i < 1000000; i++) {
            System.out.println("I'm "+id+" thread, i = " + i);
        }
    }





}
