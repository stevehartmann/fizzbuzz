package com.example.impl;

import com.example.FizzBuzz;

public class FizzBuzzNestedTernary implements FizzBuzz {
    @Override
    public void printFizzBuzz() {
        for (int number = MIN_LOOP_VALUE; number <= MAX_LOOP_VALUE; number++) {
            String label = (number % FIZZ_BUZZ_DIVISOR == 0) ? FIZZ_BUZZ_LABEL
                    : (number % FIZZ_DIVISOR == 0) ? FIZZ_LABEL
                    : (number % BUZZ_DIVISOR == 0) ? BUZZ_LABEL
                    : Integer.toString(number);
            System.out.println(label);
        }
    }
}