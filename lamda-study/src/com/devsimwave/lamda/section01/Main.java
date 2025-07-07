package com.devsimwave.lamda.section01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        /*
         * 람다식(Lambda Expression)
         * 람다식은 자바 8에서 도입된 기능으로, 코드를 더 간결하게 하고 함수를 값처럼 다룰 수 있게 해주는 방법을 제공한다.
         * 람다는
         * 스레드 실행 시 Runnalbe 인터페이스 구현
         * 정렬 기준 정의 시 Comparator 구현
         * 리스트 필터링 시 Stream API 에서 조건 정의 등 여러 곳에서 사용된다.
         */
        List<String> names = Arrays.asList("Harry", "Jamal", "Kim", "Thomas", "Manuel");

        // 기존 java 7 이전의 방식으로 익명 클래스를 사용하여 정렬 기능 구현
        /*
         *   익명 클래스를 사용하면 1회성으로 사용할 수 있는 클래스를 정의할 수 있다는 장점이 있으나 코드가 너무 복잡함
         */
        //ex) Collections.sort() 메서드를 사용하여 문자열 길이 순으로 정렬
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length(); // 길이 순 정렬
            }
        });
        System.out.println("익명 클래스를 사용한 정렬 방법 : " + names);

        // Java 8 이후의 람다 표현식을 사용하여 정렬 기능 구현
        Collections.sort(names, (o1, o2) -> o1.length() - o2.length());
        System.out.println("람다 표현식을 사용한 정렬 방법 : " + names);

        // ✅ 1. 람다식 기본 구조
        /*
            (매개변수) -> { 실행문 }
            람다는 익명 메서드를 표현하는 문법이다.
            예를 들어(a, b) -> a + b 는 두 개의 매개변수를 받아서 그 합을 반환하는 람다식이다.
         */

        // ✅ 2. 람다식과 타입 추론
        /*
            자바는 대부분의 경우 컴파일러가 타입을 추론한다.
         */
        Comparator<String> comp = (s1, s2) -> s1.length() - s2.length();    // s1, s2의 타입은 String으로 추론된다.
        System.out.println("comp 비교 결과 (\"apple\", \"kiwi\"): " + comp.compare("apple", "kiwi"));

        Comparator<String> comp2 = (String s1, String s2) -> s1.length() - s2.length();    // 명시적으로 타입을 지정할 수 있다.
        System.out.println("comp2 비교 결과 (\"banana\", \"pear\"): " + comp2.compare("banana", "pear"));

        // ✅ 3. 실행문이 여러 줄인 경우
        /*
            람다 바디(화살표 기준 우측)에 {}를 사용하게 되면 return문이 반드시 필요하다
         */
        Function<Integer, Integer> square = x -> {
            System.out.println("제곱 계산 중");
            return x * x;
        };
        System.out.println("square 결과: " + square.apply(5));
    }
}
