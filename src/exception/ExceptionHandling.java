package exception;

public class ExceptionHandling {

    public void validateAge(int age){
        if(age > 18){
            System.out.println("Exectued");
        }
        else {
            throw new ArithmeticException("Age is not vaild");
        }
    }

    public static void main(String[] args) {
        ExceptionHandling exe = new ExceptionHandling();
        try{
            exe.validateAge(21);
        }
        catch (ArithmeticException e){
            System.out.println("Enter Age is not Vaild");
        }
    }
}
