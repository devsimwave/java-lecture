package interface_segregation_principle.violation;

public class OldPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("프린터 출력");
    }

    @Override
    public void scan() {
        throw new UnsupportedOperationException("스캔 기능 없음");
    }

    @Override
    public void fax() {
        throw new UnsupportedOperationException("팩스 기능 없음");
    }
}
