package interface_segregation_principle.violation;

public class MultiFunctionPrinter implements Printer {

    @Override
    public void print() {}

    @Override
    public void scan() {}

    @Override
    public void fax() {}
}
