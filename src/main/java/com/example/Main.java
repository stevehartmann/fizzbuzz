package com.example;

public class Main {
    public static void main(String[] args) {
        FizzBuzzType fizzBuzzType = FizzBuzzType.getRandomType();
        FizzBuzz fizzBuzz = fizzBuzzType.getImplementation();
        System.out.println(fizzBuzzType);
        fizzBuzz.printFizzBuzz();
    }
}