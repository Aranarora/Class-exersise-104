
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> courses1 = new ArrayList<String>();
        courses1.add("DGL101");
        courses1.add("DGL103");
        courses1.add("DGL105");
        HTML student1 = new HTML("John Carl", "A123456", courses1);
        ArrayList<String> courses2 = new ArrayList<String>();
        courses2.add("DGL101");
        courses2.add("DGL103");
        courses2.add("DGL105");
        HTML student2 = new HTML("Jack Doe", "B234567", courses1);

        ArrayList<String> courses3 = new ArrayList<String>();
        courses3.add("DGL101");
        courses3.add("DGL103");
        courses3.add("DGL105");
        HTML student3 = new HTML("Love Simms", "A123456", courses1);



        System.out.println("Name: " + student1.getName());
        System.out.println("Student ID: " + student1.getStudentId());
        System.out.println("Courses: " + student1.getCourses());
        System.out.println();
        System.out.println("Name: " + student2.getName());
        System.out.println("Student ID: " + student2.getStudentId());
        System.out.println("Courses: " + student2.getCourses());
        System.out.println();
        System.out.println("Name: " + student3.getName());
        System.out.println("Student ID: " + student3.getStudentId());
        System.out.println("Courses: " + student3.getCourses());
        System.out.println();
    }
}
