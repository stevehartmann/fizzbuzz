package com.example.impl;

import com.example.FizzBuzz;

public class FizzBuzzStringTernary implements FizzBuzz {
    @Override
    public void printFizzBuzz() {
        for (int number = MIN_LOOP_VALUE; number <= MAX_LOOP_VALUE; number++) {
            String label = (number % FIZZ_DIVISOR == 0) ? FIZZ_LABEL : "";
            label += (number % BUZZ_DIVISOR == 0) ? BUZZ_LABEL : "";
            label += (label.isEmpty()) ? number : "";
            System.out.println(label);
        }
    }
}