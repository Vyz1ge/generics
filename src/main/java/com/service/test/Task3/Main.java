package com.service.test.Task3;

//3. Безопасное копирование
//Реализуй метод copySafe,
//который копирует элементы из List<? extends T> в List<? super T>.
//Протестируй с List<Integer> и List<Number>.

import java.util.ArrayList;
import java.util.List;

import static com.service.test.Task3.Task.copySafe;

class Main {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Number> numbers = new ArrayList<>();
        copySafe(integers, numbers);
        System.out.println(numbers);
    }
}
