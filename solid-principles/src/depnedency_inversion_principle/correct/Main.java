package depnedency_inversion_principle.correct;

public class Main {
    public static void main(String[] args) {
        /*의존 역전 역전(dependency inversion principle)이란 고수준 모듈은 저수준 모듈에 의존해서는 안 된다. 둘 다 추상(인터페이스, 추상 클래스)에 의존해야 한다.
        * 즉, 구현에 의존하는게 아닌, 인터페이스에 의존해야한다.
        * 여기서 의존이란 어떤 클래스 A가 클래스 B를 사용(호출)하거나 new로 생성하거나 메서드 호출할 때, A는 B의 의존한다고 말한다.
        * 의존관계가 높으면 B클래스가 수정이 일어날 시 A클래스도 같이 수정을 해야되는 문제가 생긴다.
        * 고수준 모듈은 정책, 규칙, 로직을 다루는 중심 클래스 (ex. 서비스)
        * 저수준 모듈은 실제 실행되는 기술적 구현체 (ex. 결제 API, DB 등)
         * */
        InputDevice keyboard = new Keyboard();
        Computer computer = new Computer(keyboard);
        computer.type();

        InputDevice btKeyboard = new BluetoothKeyboard();
        Computer btComputer = new Computer(btKeyboard);
        btComputer.type();
    }
}
