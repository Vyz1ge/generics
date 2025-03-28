package com.service.test.Task2;


import java.util.ArrayList;
import java.util.Collection;

//2. Контрвариантная очередь
//Создай класс MyQueue<T>, хранящий список элементов.
//Добавь метод addAllTo(Collection<? super T> destination), который копирует элементы очереди в другую коллекцию.
//Протестируй с MyQueue<Integer> и Collection<Number>.
public class Main {
    public static void main(String[] args) {
        Task<Integer> myQueue = new Task();
        Collection<Number> numbers = new ArrayList<>();
        myQueue.addAllTo(numbers);
        System.out.println(numbers);
    }
}
