package exception;

public class NationalityExeception {

    public void nationality(String nation){
        if(nation == "indian"){
            System.out.println("You are indian.");
        }
        else{
            throw  new Message("You are not indian");//exception object
        }
    }

    public static void main(String[] args) {

        NationalityExeception e = new NationalityExeception();
         try{
             e.nationality("Amercian");
         }
         catch (Exception z){
             System.out.println("You are not a indian");
         }

    }


}
