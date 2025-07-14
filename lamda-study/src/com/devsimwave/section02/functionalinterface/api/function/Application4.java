package com.devsimwave.section02.functionalinterface.api.function;

import com.devsimwave.section02.functionalinterface.api.function.dto.Employee;

import java.util.function.*;

public class Application4 {
    public static void main(String[] args) {
        /* Function인터페이스는 입력을 받아서 변환한 결과를 반환하는 역할을 한다. */

        /* Function 인터페이스의 종류
         * 인터페이스 명 : Function<T, R>
         * 설명        : 객체 T를 객체 R로 매핑 (입력 → 출력)
         *
         * 인터페이스 명 : BiFunction<T, U, R>
         * 설명        : 두 객체 T, U를 받아 객체 R 반환 (2개 입력 → 출력)
         *
         * 인터페이스 명 : UnaryOperator<T>
         * 설명        : 객체 T를 받아 동일한 타입 T로 반환 (Function<T, T>와 동일)
         *
         * 인터페이스 명 : BinaryOperator<T>
         * 설명        : 두 객체 T를 받아 동일한 타입 T로 반환 (BiFunction<T, T, T>와 동일)
         *
         * 인터페이스 명 : IntFunction<R>
         * 설명        : 기본형 int를 입력받아 객체 R 반환 (기본형 입력용 Function)
         *
         * 인터페이스 명 : ToIntFunction<T>
         * 설명        : 객체 T를 입력받아 int 반환 (기본형 출력용 Function)
         */

        // Function<T, R> : Employee → 이름(String)
        Function<Employee, String> getName = emp -> emp.getName();
        System.out.println(getName.apply(new Employee("흥민쏜", 33, "토트넘")));

        // BiFunction<T, U, R> : 이름(String) + 나이(Integer) → Employee
        BiFunction<String, Integer, Employee> createEmp = (name, age) -> new Employee(name, age, "바이에른뮌헨");
        System.out.println(createEmp.apply("민재킴", 28));

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

        // IntFunction<R> : int 나이 → Employee
        IntFunction<Employee> byAge = age -> new Employee("누군가", age, "성남");
        System.out.println(byAge.apply(22));

        // ToIntFunction<T> : Employee → 나이(int)
        ToIntFunction<Employee> ageExtractor = emp -> emp.getAge();
            System.out.println(ageExtractor.applyAsInt(new Employee("김미히", 30, "바이에른뮌헨")));

    }
}
