package inheritance.has_A;

import inheritance.Checkout;

public class Has {

    public static void main(String[] args) {
        Student s= new Student("101","Madhu");
        Department d= new Department("1","Cse",s);
        d.getDetails();


    }

}
