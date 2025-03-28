package com.service.test.Task5;

import java.util.List;

import static com.service.test.Task5.ConverterImpl.map;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Converter<Integer, String> intToString = Object::toString;

        List<String> stringNumbers = map(numbers, intToString);

        System.out.println(stringNumbers);
    }
}
