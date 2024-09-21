package classesAndObject;

public class Client {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "Roopesh";
        student1.batch_id = 1;
        student1.psp = 60.0;
        student1.rollno = 20;
        student1.printStudents();

        Student student2 = new Student();
        student2.name = "Aniket";
        student2.batch_id = 1;
        student2.psp = 70.0;
        student2.rollno = 22;
        student2.printStudents();


    }
}
