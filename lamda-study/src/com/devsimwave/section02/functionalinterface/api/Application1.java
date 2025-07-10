package com.devsimwave.section02.functionalinterface.api;

import java.util.function.Function;

public class Application1 {

    /*
     * 함수의 형태(signature)는 다양하다. return문이 있을 수도 없을 수도 있고 매개변수가 1개일 수도 혹은 여려개일 수도 있다.
     * 그 때 마다 매번 함수형 인터페이스를 새로 정의하면 중복되고 비효율적이다.
     * 그래서 자바는 자주 쓰는 함수 형태들을 미리 정의한 함수형 인터페이스 표준 API를 제공한다.
     */
    public static void main(String[] args) {

        // Function<T, R>: 문자열을 받아 길이를 반환
        java.util.function.Function<String, Integer> stringLength = str -> str.length();
        System.out.println("Function: 'hello' 길이 = " + stringLength.apply("hello"));

        // BiFunction<T, U, R>: 두 숫자를 받아 곱셈 결과 반환
        java.util.function.BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
        System.out.println("BiFunction: 3 * 4 = " + multiply.apply(3, 4));

        // UnaryOperator<T>: 문자열을 대문자로 변환
        java.util.function.UnaryOperator<String> toUpper = s -> s.toUpperCase();
        System.out.println("UnaryOperator: 'java' → " + toUpper.apply("java"));

        // BinaryOperator<T>: 두 문자열을 연결
        java.util.function.BinaryOperator<String> concat = (s1, s2) -> s1 + s2;
        System.out.println("BinaryOperator: 'Hello' + 'World' = " + concat.apply("Hello", "World"));
    }
}

