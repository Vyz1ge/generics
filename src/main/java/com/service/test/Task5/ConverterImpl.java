package com.service.test.Task5;

import java.util.ArrayList;
import java.util.List;

public class ConverterImpl {
    public static <F, T> List<T> map(List<F> input, Converter <? super F, ? extends T> converter) {
        List<T> result = new ArrayList<>();
        for ( F element : input) {
            result.add(converter.convert(element));
        }
        return result;
    }
}
