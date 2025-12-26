public class Circle {
    private final double r;

    public Circle(double r) {
        if (r <= 0) {
            throw new RuntimeException("There is no figure with such parameters.");
        }
        this.r = r;
    }

    public double area() {
        return Math.PI * r * r;
    }

    public double perimeter() {
        return 2 * Math.PI * r;
    }
}
