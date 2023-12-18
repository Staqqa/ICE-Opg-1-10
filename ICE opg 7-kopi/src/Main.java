public class Main {
    public static void main(String[] args) {
        Course C1 = new Course("Matematik", 7);
        Course C2 = new Course("Dansk", 10);
        Course C3 = new Course("Spansk", -3);
        Course C4 = new Course("Historie", 4);
        System.out.println(C1.toString());
        System.out.println(C2.toString());
        System.out.println(C3.toString());
        System.out.println(C4.toString());

        Diploma diploma = new Diploma("Zana");

        diploma.addCourse(C1);
        diploma.addCourse(C2);
        diploma.addCourse(C3);
        diploma.addCourse(C4);
        System.out.println(diploma.toString());


        Double total = diploma.getTotalGrade();
        System.out.println("Din gennemsnitlige karakter er; " + total);
    }
}