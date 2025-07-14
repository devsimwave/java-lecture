package com.devsimwave.section02.functionalinterface.api;

import java.util.function.*;

public class Application1 {
    /*
     * 함수의 형태(signature)는 다양하다. return문이 있을 수도 없을 수도 있고 매개변수가 1개일 수도 혹은 여러개일 수도 있다.
     * 그 때 마다 매번 함수형 인터페이스를 새로 정의하면 중복되고 비효율적이다.
     * 그래서 자바는 자주 쓰는 함수 형태들을 미리 정의한 함수형 인터페이스 표준 API를 제공한다.
     *
     */
    public static void main(String[] args) {
        /*
         * 함수형 인터페이스의 표준 API는 java.util.function 패키지로 제곧외어 있다.
         * 대표적으로 Consumer, Supplier, Function, Operator, Predicate가 있다.
         *
         */

        /* Consumer "소비자" 역할 - 매개변수 O, 리턴값 X*/
        Consumer<String> printer = s -> System.out.println(s);
        printer.accept("Java");

        /* Supplier "공급자" 역할 - 매개변수 X 리턴값 O */
        Supplier<Integer> random = () -> (int) (Math.random() * 10) + 1;
        System.out.println("랜덤값: " + random.get());

        /* Function "함수" 역할 - 매개변수 O 리턴값 ㅒ*/
        Function<String, Integer> strLength = str -> str.length();
        System.out.println(strLength.apply("Java"));

        /* Operator "Function의 확장 - Function<T, T> 형태를 추상화 */
        UnaryOperator<String> toUpper = s -> s.toUpperCase();
        System.out.println(toUpper.apply("java"));

        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(3, 7));

        /* Preidcate "조건 검사" 역할 - 입력 값을 받아 true/false 판별 */
        Predicate<String> isEmpty = s -> s.isEmpty();
        System.out.println(isEmpty.test("Bayern"));
    }
}

