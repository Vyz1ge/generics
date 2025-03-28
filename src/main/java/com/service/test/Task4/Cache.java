package com.service.test.Task4;

import java.util.HashMap;
import java.util.Map;

class Cache<K, V> {
    Map<K, V> map = new HashMap<>();

    public void put(K key, V value) {
        map.put(key, value);
    }

    public V get(K key) {
        return map.get(key);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        this.map.putAll(map);
    }
}