public class Course {
    String courseName;
    int grade;

    public Course(String courseName, int grade) {
        this.courseName = courseName;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return courseName + ": " + grade ;

    }

    public int getGrade() {
        return grade;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setGrade(int grade) {
        if (grade == 3 || grade == 2 || grade == 4 || grade == 7 || grade == 10 || grade == 12) {
            this.grade = grade;
        } else {
            System.out.println("Ugyldig karakter. Accepter kun karakterskalaen");
        }
    }
}