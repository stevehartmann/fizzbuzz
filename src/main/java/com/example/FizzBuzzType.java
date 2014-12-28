package com.example;

import com.example.impl.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public enum FizzBuzzType {
    ARRAY(0, "Array", new FizzBuzzArray()),
    BOOLEAN_FLAG(1, "Boolean Flag", new FizzBuzzBooleanFlag()),
    ENUM(2, "Enum", new FizzBuzzEnum()),
    LIST(3, "List", new FizzBuzzList()),
    MAP(4, "Map", new FizzBuzzMap()),
    NESTED_CONDITIONAL(5, "Nested Conditional", new FizzBuzzNestedConditional()),
    NESTED_TERNARY(6, "Nested Ternary", new FizzBuzzNestedTernary()),
    NO_STRINGS(7, "No Strings", new FizzBuzzNoStrings()),
    STRING_BUILDER(8, "StringBuilder", new FizzBuzzStringBuilder()),
    STRING_CONCATENATION(9, "String Concatenation", new FizzBuzzStringConcatenation()),
    STRING_TERNARY(10, "String Ternary", new FizzBuzzStringTernary()),
    SWITCH(11, "Switch", new FizzBuzzSwitch());

    private static final Map<Integer, FizzBuzzType> REVERSE_LOOKUP_MAP = new HashMap<>();
    static {
        for (FizzBuzzType fizzBuzzType : values()) {
            REVERSE_LOOKUP_MAP.put(fizzBuzzType.getCode(), fizzBuzzType);
        }
    }

    private Integer code;
    private String description;
    private FizzBuzz implementation;

    private FizzBuzzType(Integer code, String description, FizzBuzz implementation) {
        this.code = code;
        this.description = description;
        this.implementation = implementation;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public FizzBuzz getImplementation() {
        return implementation;
    }

    public static FizzBuzzType getRandomType() {
        int selectedIndex = new Random().nextInt(values().length);
        return REVERSE_LOOKUP_MAP.get(selectedIndex);
    }

    @Override
    public String toString() {
        return getDescription();
    }
}