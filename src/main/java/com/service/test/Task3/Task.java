package com.service.test.Task3;

import java.util.ArrayList;
import java.util.List;

public class Task {
    public static <T> void copySafe(List<? extends T> _in, List<? super T> _out) {
        _out.addAll(_in);
    }

    public static <T> List<? super T> copySafe(List<? extends T> _in) {
        return new ArrayList<>(_in);
    }
}
