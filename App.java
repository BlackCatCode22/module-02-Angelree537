import static java.sql.DriverManager.println;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        Student myStudent = new Student();
        myStudent.firstName = "Jim";
        myStudent.lastName = "Halpert";
        myStudent.major = "Business";
        myStudent.gpa = 2.3;
        myStudent.age = 24;
        myStudent.onProbation = false;

        Student myStudent2 = new Student();
        myStudent.firstName = "Pam";
        myStudent.lastName = "Beasley";
        myStudent.major = "Art";
        myStudent.gpa = 2.5;
        myStudent.age = 23;
        myStudent.onProbation = true;

        System.out.println(myStudent.firstName);

    }
}