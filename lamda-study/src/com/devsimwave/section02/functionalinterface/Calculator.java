package com.devsimwave.section02.functionalinterface;

@FunctionalInterface
public interface Calculator {
    /**
     * 함수형 인터페이스란 추상 메소드가 딱 하나만 존재하는 인터페이스를 말한다.
     * 람다식은 어떤 추상 메소드를 구현하는건데
     * @FunctionalInterface 어노테이션을 사용하면 컴파일러가 이를 체크해준다.
     * 단 default 메소드나 static 메소드는 여러 개 정의할 수 있다.
     */
    int operate(int a, int b);
    // int divide(int a, int b);        // 컴파일 에러

    default void print() {} // 디폴트 메소드
    static void print2() {} // static 메소드


}
