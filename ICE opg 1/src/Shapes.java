import java.util.ArrayList;

public class Shapes {
    ArrayList<Shape> shapes = new ArrayList<>();

    public void addShape(Shape s) {
        shapes.add(s);

    }


    public double totalArea() {
        double totalArea = 0.0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }


        return totalArea;

    }
}
