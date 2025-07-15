package com.devsimwave.section02.functionalinterface.api.operator;

import com.devsimwave.section02.functionalinterface.api.function.dto.Employee;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Application5 {
    public static void main(String[] args) {
        /* Function<T, R>은 입력값 T를 받아 결과값 R을 반환하는 함수이다.
        * 이 중에서 입력값과 반환값의 타입이 같을 때, 다음 두 가지 Operator 인터페이스를 사용한다.
        * 인터페이스 명 : UnaryOperator<T>
        * 설명        : 객체 T를 받아 동일한 타입 T로 반환 (Function<T, T>와 동일)
        *
        * 인터페이스 명 : BinaryOperator<T>
        * 설명        : 두 객체 T를 받아 동일한 타입 T로 반환 (BiFunction<T, T, T>와 동일)
        *
        * 이 인터페이스를 사용하는 이유는 Function에 비해 가독성이 있으며 의도가 분명하다
        * */

        // UnaryOperator<T> : Employee → 이름을 대문자로 바꾼 새 Employee
        UnaryOperator<Employee> upperName = emp ->
                new Employee(emp.getName(), emp.getAge(), emp.getDepartment().toUpperCase());
        System.out.println(upperName.apply(new Employee("강인리", 24, "psg")));

        // BinaryOperator<T> : Employee 2명을 받아 더 나이가 많은 쪽 반환
        BinaryOperator<Employee> older = (e1, e2) -> e1.getAge() >= e2.getAge() ? e1 : e2;
        System.out.println(older.apply(
                new Employee("로날도", 40, "알나스르"),
                new Employee("황소", 28, "울버햄튼")
        ));
    }
}
