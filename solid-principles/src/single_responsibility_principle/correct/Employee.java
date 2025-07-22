package single_responsibility_principle.correct;

public class Employee {
    private String name;
    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
