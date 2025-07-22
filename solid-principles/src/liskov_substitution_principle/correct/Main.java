package liskov_substitution_principle.correct;

public class Main {
    public static void main(String[] args) {
        /*
        * 리스코프 치환 원칙(Liskov Substitution Principle)은 자식 클래스는 언제나 부모 클래스로 교체해도 정상적으로 동작해야한다.
        * 즉, 상속 받은 하위 클래스는 상위 클래스의 규약을 지켜야 한다는 원칙이다.
        * 부모 타입을 사용하는 코드가 있다면, 그 자리에 자식 타입 객체를 넣어도 프로그래므의 의미나 동작이 바뀌지 않아야 한다는 원칙이다.
        * */
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(10);

        Square square = new Square();
        square.setSide(7);

        System.out.println("rectangle 면적 : " + rectangle.getArea());
        System.out.println("square 면적 : " + square.getArea());
    }
}
