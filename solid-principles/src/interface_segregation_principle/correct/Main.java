package interface_segregation_principle.correct;

public class Main {
    public static void main(String[] args) {
        /*
        * 인터페이스 분리 원칙(Interface Segregation Principle)이란 클라이언트는 자신이 사용하지 않는 메소드에 의존하지 안하야 한다.
        * 즉, 불필요한 메소드까지 포함된 큰 인터페이스가 아닌 역할에 따라 인터페이스를 나눠야 한다.
        * */
        Printer printer = new MultiFunctionPrinter();
        Scanner scanner = new MultiFunctionPrinter();
        Fax fax = new MultiFunctionPrinter();

        printer.print();
        scanner.scan();
        fax.fax();

        // 또는 구체 클래스로 직접 사용
        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        mfp.print();
        mfp.scan();
        mfp.fax();
    }
}
