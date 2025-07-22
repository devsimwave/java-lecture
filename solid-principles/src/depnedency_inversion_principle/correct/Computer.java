package depnedency_inversion_principle.correct;

public class Computer {
    private final InputDevice inputDevice;

    // 생성자 주입
    public Computer(InputDevice inputDevice) {
        this.inputDevice = inputDevice;
    }

    public void type() {
        System.out.println(inputDevice.getInput());
    }
}
