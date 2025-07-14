package com.devsimwave.section02.functionalinterface.api.consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

public class Application2 {

    public static void main(String[] args) {
        /* Consumer는 자바 함수형 인터페이스 중에서 입력을 받아서 어떤 작업을 수행하지만 반환은 없는 타입이다. */

        /* BiConsumer<T, U> 두 개의 입력값을 받아 처리 */
        BiConsumer<String, Integer> mapAdder = (key, value) -> {
            Map<String, Integer> map = new HashMap<>();
            map.put(key, value);
            System.out.println(map);
        };
        mapAdder.accept("apple", 3);

        /* 자바는 오토박싱/언박싱을 피해서 성능 향상을 하는 함수를 제공한다.
        * 기본형(int, long, double) 처리 전용 Consumer */
        Consumer<Integer> printInt = x -> System.out.println(x);
        printInt.accept(5); // int -> Integer(오토박싱) 성능 저하

        IntConsumer squarePrinter = x -> System.out.println(x * x);
        squarePrinter.accept(5);

        LongConsumer printLong = l -> System.out.println("Long : " + l);
        printLong.accept(10000000000L);

        DoubleConsumer doubleConsumer = d -> System.out.printf("소수점: %.2f%n", d);
        doubleConsumer.accept(3.14159);

    }

}
