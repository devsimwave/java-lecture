package interface_segregation_principle.correct;

public class MultiFunctionPrinter implements Printer, Scanner, Fax {

    @Override
    public void print() {
        System.out.println("프린트 출력");
    }

    public void scan() {
        System.out.println("문서 스캔");
    }

    public void fax() {
        System.out.println("팩스 전송");
    }
}
