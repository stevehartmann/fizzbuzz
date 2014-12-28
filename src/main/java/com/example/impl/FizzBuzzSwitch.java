package com.example.impl;

import com.example.FizzBuzz;

public class FizzBuzzSwitch implements FizzBuzz {
    @Override
    public void printFizzBuzz() {
        for (int number = MIN_LOOP_VALUE; number <= MAX_LOOP_VALUE; number++) {
            switch (number % FIZZ_BUZZ_DIVISOR) {
                case 0:
                    System.out.println(FIZZ_BUZZ_LABEL);
                    break;
                case FIZZ_DIVISOR:
                case FIZZ_DIVISOR * 2:
                case FIZZ_DIVISOR * 3:
                case FIZZ_DIVISOR * 4:
                    System.out.println(FIZZ_LABEL);
                    break;
                case BUZZ_DIVISOR:
                case BUZZ_DIVISOR * 2:
                    System.out.println(BUZZ_LABEL);
                    break;
                default:
                    System.out.println(number);
            }
        }
    }
}