import java.util.*;
import java.util.function.Predicate;


//1. Ковариантный фильтр. Определить метод filter, принимающий список с wildcard ? extends T и предикат ? super T.
// Метод должен возвращать отфильтрованный список элементов.
//Протестируй с List<Integer> и предикатом, фильтрующим чётные числа.
public class Main {
    private static <T> List<T> filter(List<? extends T> _in, Predicate<? super T> predicate) {
        List<T> _out = new ArrayList<T>();
        _in.stream().filter(predicate).forEach(_out::add);
        return _out;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list1 = filter(list, (x) -> x % 2 == 0);
        System.out.println(list1);
    }

}

//2. Контрвариантная очередь
//Создай класс MyQueue<T>, хранящий список элементов.
//Добавь метод addAllTo(Collection<? super T> destination), который копирует элементы очереди в другую коллекцию.
//Протестируй с MyQueue<Integer> и Collection<Number>.

class MyQueue<Q> {
    private final List<Q> list = new ArrayList<>();

    /// ///

    public void addAllTo(Collection<? super Q> destination) {
        destination.addAll(this.list);
    }
}

class Main2 {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>();
        Collection<Number> numbers = new ArrayList<>();
        myQueue.addAllTo(numbers);
        System.out.println(numbers);
    }
}

//3. Безопасное копирование
//Реализуй метод copySafe,
//который копирует элементы из List<? extends T> в List<? super T>.
//Протестируй с List<Integer> и List<Number>.

class Main3 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Number> numbers = new ArrayList<>();
        copySafe(integers, numbers);
        System.out.println(numbers);
    }

    public static <T> void copySafe(List<? extends T> _in, List<? super T> _out) {
        _out.addAll(_in);
    }

    public static <T> List<? super T> copySafe(List<? extends T> _in) {
        return new ArrayList<>(_in);
    }

}

//4. Обобщённый кэш
//Создай класс Cache<K, V> с методами put, get и putAll,
// где putAll принимает Map<? extends K, ? extends V>.
//Протестируй с Cache<Number, Object> и Map<Integer, String>.

class Main4 {
    public static void main(String[] args) {
        Cache<Number, Object> stringCache = new Cache<>();
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Q");
        map.put(2, "W");
        stringCache.putAll(map);
        System.out.println(stringCache);

    }

    static class Cache<K, V> {
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

}
//5. Обобщённый конвертер
//Определи интерфейс Converter<F, T>.
//Реализуй метод map,
//который применяет Converter<? super F, ? extends T> к каждому элементу входного списка.
//Протестируй преобразование List<Integer> в List<String>.

@FunctionalInterface
interface Converter<F, T> {
    T convert(F in);
}

class Test2 {
    public static void main(String[] args) {
        Test2 test = new Test2();
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> strings = new ArrayList<>();
        integers.forEach(x -> strings.add(test.map(x)));
        System.out.println(strings);
    }

    public List map(List input, Converter converter) {

    }
}
