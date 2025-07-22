package single_responsibility_principle.correct;

public class EmployeePrinter {
    public void print(Employee employee) {
        System.out.println("직원 이름: " + employee.getName());
    }
}
