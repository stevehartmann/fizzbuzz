package com.example.impl;

import com.example.FizzBuzz;

public class FizzBuzzArray implements FizzBuzz {
    @Override
    public void printFizzBuzz() {
        for (int number = MIN_LOOP_VALUE; number <= MAX_LOOP_VALUE; number++) {
            String label = DIVISOR_LABEL_ARRAY[number % FIZZ_BUZZ_DIVISOR];
            if (label.isEmpty()) {
                label += number;
            }
            System.out.println(label);
        }
    }

    private static final String[] DIVISOR_LABEL_ARRAY = new String[]{
        FIZZ_BUZZ_LABEL, EMPTY_LABEL, EMPTY_LABEL, FIZZ_LABEL, EMPTY_LABEL,
        BUZZ_LABEL, FIZZ_LABEL, EMPTY_LABEL, EMPTY_LABEL, FIZZ_LABEL,
        BUZZ_LABEL, EMPTY_LABEL, FIZZ_LABEL, EMPTY_LABEL, EMPTY_LABEL
    };
}