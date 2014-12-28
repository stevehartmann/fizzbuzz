package com.example.impl;

import com.example.FizzBuzz;

public class FizzBuzzNoStrings implements FizzBuzz {
    @Override
    public void printFizzBuzz() {
        for (int number = MIN_LOOP_VALUE; number <= MAX_LOOP_VALUE; number++) {
            if (number % FIZZ_BUZZ_DIVISOR == 0) {
                System.out.println(FIZZ_BUZZ_LABEL);
            } else if (number % FIZZ_DIVISOR == 0) {
                System.out.println(FIZZ_LABEL);
            } else if (number % BUZZ_DIVISOR == 0) {
                System.out.println(BUZZ_LABEL);
            } else {
                System.out.println(number);
            }
        }
    }
}