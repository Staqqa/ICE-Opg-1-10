public class Main {
    public static void main(String[] args) {

        Square s = new Square(5, 5);
        double d = s.calculateArea();
        System.out.println(d);

        Circle c = new Circle(10);
        double dd = c.calculateArea();
        System.out.println(dd);

        Shapes S1 = new Shapes();
        S1.addShape(s);
        S1.addShape(c);

        double allAreal = S1.totalArea();
        System.out.println(allAreal);


        // System.out.println(d * dd );

    }

}