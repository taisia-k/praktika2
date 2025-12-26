public class Rectangle {
    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        if (a <= 0 || b <= 0) {
            throw new RuntimeException("There is no figure with such parameters.");
        }
        this.a = a;
        this.b = b;
    }

    public double area() {
        return a * b;
    }

    public double perimeter() {
        return 2 * (a + b);
    }
}
