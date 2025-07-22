package interface_segregation_principle.violation;

public class Main {
    public static void main(String[] args) {
        Printer multiFunctionPrinter = new MultiFunctionPrinter();
        Printer OldPrinter = new OldPrinter();

        multiFunctionPrinter.print();
        OldPrinter.print();

        multiFunctionPrinter.scan();
        OldPrinter.scan();      // 여기서 부터 오류 인터페이스 분리 원칙은 불필요한 인터페이스는 만들지 않아야 한다.

        multiFunctionPrinter.fax();
        multiFunctionPrinter.fax();
    }
}
