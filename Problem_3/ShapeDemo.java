public class ShapeDemo {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle", 5);
        System.out.println("Circle");
        System.out.println("Circle area: " + circle.area());
        System.out.println("Circle perimeter: " + circle.perimeter());
        System.out.println();

        Ellipse ellipse = new Ellipse("Ellipse", 5, 10);
        System.out.println("Ellipse");
        System.out.println("Ellipse area: " + ellipse.area());
        System.out.println("Ellipse perimeter: " + ellipse.perimeter());
        System.out.println();

        Triangle triangle = new Triangle("Triangle", 3, 4, 5);
        System.out.println("Triangle");
        System.out.println("Triangle area: " + triangle.area());
        System.out.println("Triangle perimeter: " + triangle.perimeter());
        System.out.println();

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle("Equilateral Triangle", 5);
        System.out.println("Equilateral Triangle");
        System.out.println("Equilateral Triangle area: " + equilateralTriangle.area());
        System.out.println("Equilateral Triangle perimeter: " + equilateralTriangle.perimeter());
        System.out.println();
    }
}
