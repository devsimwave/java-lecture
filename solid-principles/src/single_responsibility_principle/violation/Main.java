package single_responsibility_principle.violation;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("홍길동");

        // SRP를 위반: Employee가 출력과 저장 둘 다 수행
        emp.printReport();      // 출력 책임
        emp.saveToFile();       // 저장 책임
    }
}
