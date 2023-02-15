package inheritance;

public class Checkout extends  Product {

    public static void main(String[] args) {
        Checkout c= new Checkout();
      String view=  c.addProduct("1","Iphone13","Apple");

        System.out.println(view);
    }
}
