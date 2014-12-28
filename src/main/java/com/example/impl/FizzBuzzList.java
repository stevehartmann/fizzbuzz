package com.example.impl;

import com.example.FizzBuzz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzzList implements FizzBuzz {
    @Override
    public void printFizzBuzz() {
        for (int number = MIN_LOOP_VALUE; number <= MAX_LOOP_VALUE; number++) {
            String label = DIVISOR_LABEL_LIST.get(number % FIZZ_BUZZ_DIVISOR);
            if (label.isEmpty()) {
                label += number;
            }
            System.out.println(label);
        }
    }

    private static final List<String> DIVISOR_LABEL_LIST = new ArrayList<>(
       Arrays.asList(
            FIZZ_BUZZ_LABEL, EMPTY_LABEL, EMPTY_LABEL,
            FIZZ_LABEL, EMPTY_LABEL, BUZZ_LABEL, FIZZ_LABEL,
            EMPTY_LABEL, EMPTY_LABEL, FIZZ_LABEL, BUZZ_LABEL,
            EMPTY_LABEL, FIZZ_LABEL, EMPTY_LABEL, EMPTY_LABEL
    ));
}