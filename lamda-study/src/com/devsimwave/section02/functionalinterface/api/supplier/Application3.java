package com.devsimwave.section02.functionalinterface.api.supplier;

import java.util.function.*;

public class Application3 {
    public static void main(String[] args) {
        /* supplier는 자바 함수형 인터페이스 중에서 입력 없이 값만 반환하는 타입이다.
        * 활용 예  : 랜던 값 생성, 현재 시간 반환, 객체 초기화 등 */

        /* consumer 인터페이스와 마찬가지로 autoboxing을 피가히 위한 함수가 별도로 정의되어 있따. */
        Supplier<String> stringSupplier = () -> "Hello supplier!";
        System.out.println(stringSupplier.get());

        BooleanSupplier booleanSupplier = () -> true;
        System.out.println(booleanSupplier.getAsBoolean());

        IntSupplier randomInt = () -> (int) (Math.random() * 100);
        System.out.println("Int : " + randomInt.getAsInt());

        LongSupplier currentTime = () -> System.currentTimeMillis();
        System.out.println("현재  밀리초 : " + currentTime.getAsLong());

        DoubleSupplier randomDouble = () -> Math.random();
        System.out.println("Double: " + randomDouble.getAsDouble());

    }
}
