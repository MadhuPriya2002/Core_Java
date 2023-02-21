package exception;

public class Message  extends RuntimeException{
    String message;

    Message(String message){
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message='" + message + '\'' +
                '}';
    }
}
