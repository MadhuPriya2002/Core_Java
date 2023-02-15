package abstraction;

public class Paytm extends Payment{
        int billAmount;

    @Override
    public void getBill(int x) {
        System.out.println( billAmount=x*10);
    }

    @Override
    public void printBill() {
        System.out.println(billAmount);
    }
}
