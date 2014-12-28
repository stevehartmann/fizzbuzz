package com.example.impl;

import com.example.FizzBuzz;

import java.util.HashMap;
import java.util.Map;

public class FizzBuzzMap implements FizzBuzz {
    @Override
    public void printFizzBuzz() {
        for (int number = MIN_LOOP_VALUE; number <= MAX_LOOP_VALUE; number++) {
            String label = DIVISOR_MAP.get(number % FIZZ_BUZZ_DIVISOR);
            if (label == null) {
                label += number;
            }
            System.out.println(label);
        }
    }

    private static final Map<Integer, String> DIVISOR_MAP = new HashMap<>();
    static {
        DIVISOR_MAP.put(0, FIZZ_BUZZ_LABEL);
        DIVISOR_MAP.put(FIZZ_DIVISOR, FIZZ_LABEL);
        DIVISOR_MAP.put(FIZZ_DIVISOR * 2, FIZZ_LABEL);
        DIVISOR_MAP.put(FIZZ_DIVISOR * 3, FIZZ_LABEL);
        DIVISOR_MAP.put(FIZZ_DIVISOR * 4, FIZZ_LABEL);
        DIVISOR_MAP.put(BUZZ_DIVISOR, BUZZ_LABEL);
        DIVISOR_MAP.put(BUZZ_DIVISOR * 2, BUZZ_LABEL);
    }
}