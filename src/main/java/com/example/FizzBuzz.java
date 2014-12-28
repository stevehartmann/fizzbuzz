package com.example;

public interface FizzBuzz {

    int MIN_LOOP_VALUE = 1;
    int MAX_LOOP_VALUE = 100;

    String EMPTY_LABEL = "";

    int FIZZ_DIVISOR = 3;
    String FIZZ_LABEL = "Fizz";

    int BUZZ_DIVISOR = 5;
    String BUZZ_LABEL = "Buzz";

    int FIZZ_BUZZ_DIVISOR = FIZZ_DIVISOR * BUZZ_DIVISOR;
    String FIZZ_BUZZ_LABEL = FIZZ_LABEL + BUZZ_LABEL;

    void printFizzBuzz();

}