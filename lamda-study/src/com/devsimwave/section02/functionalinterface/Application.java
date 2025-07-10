package com.devsimwave.section02.functionalinterface;


public class Application {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        System.out.println(add);
        System.out.println("덧셈 결과: " + add.operate(10, 20));
    }
}
