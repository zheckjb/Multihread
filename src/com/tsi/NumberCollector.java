package com.tsi;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Javacourses on 17.05.2017..
 */
public class NumberCollector {
    private final List<Integer> numbers= new ArrayList<>();

    public synchronized void add(int num){
        numbers.add(num);

    }
}
