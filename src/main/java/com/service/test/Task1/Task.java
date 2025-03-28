package com.service.test.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Task {
    public <T> List<T> filter(List<? extends T> _in, Predicate<? super T> predicate) {
        List<T> _out = new ArrayList<T>();
        _in.stream().filter(predicate).forEach(_out::add);
        return _out;
    }
}
