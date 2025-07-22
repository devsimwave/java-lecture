package liskov_substitution_principle.violation;

public class Main {
    public static void main(String[] args) {
        /* 다음과 같은 코드는 리스코프 치환 원틱을 위배한다.
         * 자식 클래스가 부모 클래스를 사용하고 있는데
         * 의도와 다르게 코드간 나오고 있다.
         */
        Rectangle rectangle = new Square();
        rectangle.setHeight(5);
        rectangle.setWidth(10);

        System.out.println(rectangle.getArea());    // 예상한 면적: 5 x 10 = 50 실제 면적: 10 x 10 = 100
    }
}
