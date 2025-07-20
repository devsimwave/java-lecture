package srp.correct;

public class Main {
    public static void main(String[] args) {
        /*단익 책임 원칙 (Single Responsibility Principle)이란
        클래스는 단 하나의 책임만 가져야한다. 즉, 하나의 클래스는 하나의 변경 이유만 가져야 한다라는 듰이다.
        1. 하나의 클래스가 너무 많은 역할을 가지면, 하나의 책임이 바뀔 떄 다른 책임에도 영향을 줄 수 있어 유지보수가 어려워진다
        2. 변경이 잦은 이유가 클래스마다 하나여야 코드를 안정적으로 유지할 수 있따.

        */
        Employee emp = new Employee("홍길동");
        new EmployeePrinter().print(emp);
    }
}