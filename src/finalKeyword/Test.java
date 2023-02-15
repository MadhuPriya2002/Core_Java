package finalKeyword;

public  class Test {

    final int age=20;

    public static void main(String[] args) {
        Test t= new Test();
//        t.age=40; Cannot assign a value to final variable 'age'
        System.out.println(t.age);
    }
}
