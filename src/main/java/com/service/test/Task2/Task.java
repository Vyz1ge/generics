package com.service.test.Task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Task<Q> {
    private final List<Q> list = new ArrayList<>();

    public void addAllTo(Collection<? super Q> destination) {
        destination.addAll(this.list);
    }
}
