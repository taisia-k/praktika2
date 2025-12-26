public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(3, 5);
        System.out.println("Rectangle area: " + rect.area());
        System.out.println("Rectangle perimeter: " + rect.perimeter());

        Circle circle = new Circle(4);
        System.out.println("Circle area: " + circle.area());
        System.out.println("Circle perimeter: " + circle.perimeter());

        Triangle tri = new Triangle(3, 4, 5);
        System.out.println("Triangle area: " + tri.area());
        System.out.println("Triangle perimeter: " + tri.perimeter());

        // Triangle bad = new Triangle(1, 2, 10); (проверка ошибки)
    }
}
