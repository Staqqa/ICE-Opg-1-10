public class Circle implements Shape {

    double radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return (Math.PI * (radius * radius));

    }
}