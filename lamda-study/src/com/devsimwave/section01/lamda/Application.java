package com.devsimwave.section01.lamda;

public class Application {
    public static void main(String[] args) {

        /*
         * 람다식(Lambda Expression)
         * 람다식은 자바 8에서 도입된 기능으로, 코드를 더 간결하게 하고 함수를 값처럼 다룰 수 있게 해주는 방법을 제공한다.
         * 람다는 스레드 실행 시 Runnable 인터페이스 구현,
         * 정렬 기준 정의 시 Comparator 구현,
         * 리스트 필터링 시 Stream API 에서 조건 정의 등 여러 곳에서 사용된다.
         */


        /*
         * 기존 java 7 이전의 방식으로 익명 클래스를 사용했을 떄
         * 익명 클래스를 사용하면 1회성으로 사용할 수 있는 클래스를 정의할 수 있다는 장점이 있으나 코드가 너무 복잡함
         */
        Calculator calculator = new Calculator() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        System.out.println(calculator);

        // Java 8 이후의 람다 표현식을 사용하여 정렬 기능 구현
        Calculator calculator2 = (x, y) -> x + y;
        System.out.println(calculator2);


        /*
            ✅ 1. 람다식 기본 구조
            (매개변수) -> { 실행문 } 람다는 익명 메서드를 표현하는 문법이다.

            ✅ 2. 람다식과 타입 추론
            자바 컴파일러가 람다식의 매개변수의 타입을 지정하지 않아도 자동으로 추론한다.
            조건은 람다식이 어떤 함수형 인터페이스를 구현하는지 알아야할 때 ex) Comparator<String>, Function<Integer, String> 등
            추상 메소드의 매개변수 타입이 명확해야한다. ex) Interface의 추상메소드
         */
        Calculator calculator3 = (x, y) -> x + y; // 매개변수의 타입을 명시하지 않아도 타입을 추론할 수 있다.
        Calculator calculator4 = (int x, int y) -> x - y; // 타입을 직접 명시해도 상관 없다.


        /*
            ✅ 3. 실행문이 여러 줄인 경우
            람다 바디(화살표 기준 우측)에 {}를 사용하게 되면 return문이 반드시 필요하다
         */
        Calculator calculator5 = (x, y) -> {
            System.out.println("계산중");
            return x * y;
        };
        System.out.println("square 결과: " + calculator5);
    }
}
