package srp.violation;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    // 직원 정보를 출력
    public void printReport() {
        System.out.println("직원 이름: " + name);
    }

    // 직원 정보를 파일로 저장
    public void saveToFile() {
        System.out.println("직원 정보를 파일에 저장했습니다.");
    }
}
