package com.service.test.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
public class Main {


//1. Ковариантный фильтр. Определить метод filter, принимающий список с wildcard ? extends T и предикат ? super T.
// Метод должен возвращать отфильтрованный список элементов.
//Протестируй с List<Integer> и предикатом, фильтрующим чётные числа.
    public static void main(String[] args) {
        Task task = new Task();
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list1 = task.filter(list, (x) -> x % 2 == 0);
        System.out.println(list1);
    }

}
