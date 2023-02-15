package polymorphism;

public class Product {

    public void display(){
        System.out.println("Madhu priya");
    }

    public int display(int x, int y){
        return x+y;
    }

    public String display(String fName, String lName){
        return fName+lName;
    }

    public float display(float a, float b){
        return a+b;
    }

    public static void main(String[] args) {

        Product p = new Product();

       float h= p.display(2.0f,3.0f);

        System.out.println(h);
    }
}
