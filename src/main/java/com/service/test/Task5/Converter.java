package com.service.test.Task5;

@FunctionalInterface
interface Converter<F, T> {
    T convert(F in);
}

