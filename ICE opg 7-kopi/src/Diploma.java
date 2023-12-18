import java.util.ArrayList;

public class Diploma {
    String studentName;
    ArrayList<Course> courses;

    public Diploma(String studentName){
    this.studentName = studentName;
    this.courses = new ArrayList<>();
    }

    public void addCourse(Course course){
        courses.add(course);

    }
    public double getTotalGrade() {
        double totalGrade = 0;
        for (Course course : courses) {
            totalGrade += course.getGrade();
        }
        return totalGrade;
    }

    public String toString(){
        return studentName + courses;
    }

}
