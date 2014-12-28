package com.example.impl;

import com.example.FizzBuzz;

public class FizzBuzzStringBuilder implements FizzBuzz {
    @Override
    public void printFizzBuzz() {
        for (int number = MIN_LOOP_VALUE; number <= MAX_LOOP_VALUE; number++) {
            StringBuilder label = new StringBuilder();
            if (number % FIZZ_DIVISOR == 0) {
                label.append(FIZZ_LABEL);
            }
            if (number % BUZZ_DIVISOR == 0) {
                label.append(BUZZ_LABEL);
            }
            if (label.length() == 0) {
                label.append(number);
            }
            System.out.println(label);
        }
    }
}