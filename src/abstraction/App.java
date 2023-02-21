package abstraction;

public class App {

    public static void main(String[] args) {
        Payment pay= new Paytm();

        pay.getBill(100);
        pay.printBill();
    }



}
