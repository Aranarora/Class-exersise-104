
import java.util.ArrayList;

public class HTML {
    private String name;
    private String studentId;
    private ArrayList<String> courses;

    public HTML(String name, String studentId, ArrayList<String> courses) {
        this.name = name;
        this.studentId = studentId;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }
}





