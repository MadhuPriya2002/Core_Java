package inheritance.has_A;

public class Department {

    String depID;

    String depName;

    Student student;

    public Department(String depID, String depName, Student student) {
        this.depID = depID;
        this.depName = depName;
        this.student = student;
    }

    public void getDetails(){
        System.out.println("Department Id :"+depID);
        System.out.println("Department Name :"+depName);
        System.out.println("Student Id:"+ student.stId);
        System.out.println("Student Name:"+ student.sName);

    }
}
