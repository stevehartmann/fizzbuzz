package com.example.impl;

import com.example.FizzBuzz;

public class FizzBuzzEnum implements FizzBuzz {
    @Override
    public void printFizzBuzz() {
        for (int number = MIN_LOOP_VALUE; number <= MAX_LOOP_VALUE; number++) {
            StringBuilder label = new StringBuilder();
            for (Divisor divisor : Divisor.values()) {
                if (number % divisor.getValue() == 0) {
                    label.append(divisor.getLabel());
                }
            }
            if (label.length() == 0) {
                label.append(number);
            }
            System.out.println(label);
        }
    }

    private enum Divisor {
        FIZZ(FIZZ_DIVISOR, FIZZ_LABEL),
        BUZZ(BUZZ_DIVISOR, BUZZ_LABEL);

        private Integer value;
        private String label;

        private Divisor(Integer value, String label) {
            this.value = value;
            this.label = label;
        }

        public Integer getValue() {
            return value;
        }

        public String getLabel() {
            return label;
        }
    }
}