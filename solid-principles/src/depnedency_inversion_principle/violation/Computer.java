package depnedency_inversion_principle.violation;

public class Computer {
    private final Keyboard keyboard = new Keyboard(); // 👈 구현에 직접 의존 Keyboard 객체가 변경되면 Computer객체도 영향이감 의존성이 높은 코드

    public void type() {
        System.out.println(keyboard.getInput());
    }
}
