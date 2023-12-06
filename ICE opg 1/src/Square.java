public class Square implements Shape {
    int length;
    int height;

    public Square(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public double calculateArea() {
        return (height * length);

    }

}



