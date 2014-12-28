package com.example.impl;

import com.example.FizzBuzz;

public class FizzBuzzStringConcatenation implements FizzBuzz {
    @Override
    public void printFizzBuzz() {
        for (int number = MIN_LOOP_VALUE; number <= MAX_LOOP_VALUE; number++) {
            String label = "";
            if (number % FIZZ_DIVISOR == 0) {
                label += FIZZ_LABEL;
            }
            if (number % BUZZ_DIVISOR == 0) {
                label += BUZZ_LABEL;
            }
            if (label.isEmpty()) {
                label += number;
            }
            System.out.println(label);
        }
    }
}