package com.example.impl;

import com.example.FizzBuzz;

public class FizzBuzzNestedConditional implements FizzBuzz {
    @Override
    public void printFizzBuzz() {
        for (int number = MIN_LOOP_VALUE; number <= MAX_LOOP_VALUE; number++) {
            if (number % FIZZ_DIVISOR == 0) {
                System.out.print(FIZZ_LABEL);
                if (number % BUZZ_DIVISOR == 0) {
                    System.out.print(BUZZ_LABEL);
                }
                System.out.println();
            } else if (number % BUZZ_DIVISOR == 0) {
                System.out.println(BUZZ_LABEL);
            } else {
                System.out.println(number);
            }
        }
    }
}