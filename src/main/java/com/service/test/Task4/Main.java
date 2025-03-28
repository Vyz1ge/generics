package com.service.test.Task4;

//4. Обобщённый кэш
//Создай класс Cache<K, V> с методами put, get и putAll,
// где putAll принимает Map<? extends K, ? extends V>.
//Протестируй с Cache<Number, Object> и Map<Integer, String>.

import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        Cache<Number, Object> stringCache = new Cache<>();
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Q");
        map.put(2, "W");
        stringCache.putAll(map);
        System.out.println(stringCache);

    }
}