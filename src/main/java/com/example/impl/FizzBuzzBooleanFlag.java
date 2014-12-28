package com.example.impl;

import com.example.FizzBuzz;

public class FizzBuzzBooleanFlag implements FizzBuzz {
    @Override
    public void printFizzBuzz() {
        for (int number = MIN_LOOP_VALUE; number <= MAX_LOOP_VALUE; number++) {
            boolean isFizzOrBuzz = false;
            if (number % FIZZ_DIVISOR == 0) {
                System.out.print(FIZZ_LABEL);
                isFizzOrBuzz = true;
            }
            if (number % BUZZ_DIVISOR == 0) {
                System.out.print(BUZZ_LABEL);
                isFizzOrBuzz = true;
            }
            if (!isFizzOrBuzz) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}