public class ScalableShapeDemo {
    public static void main(String[] args) {
        double scaleFactor = 2;
        ScalableShape[] shapes = new ScalableShape[4];
        shapes[0] = new ScalableCircle("Circle", 5);
        shapes[1] = new ScalableEllipse("Ellipse", 5, 10);
        shapes[2] = new ScalableTriangle("Triangle", 3, 4, 5);
        shapes[3] = new ScalableEquilateralTriangle("Equilateral Triangle", 5);

        for (ScalableShape shape : shapes) {
            System.out.println("Name: " + shape.getName());
            System.out.println("Area: " + shape.area());
            System.out.println("Perimeter: " + shape.perimeter());
            shape.scale(scaleFactor);
            System.out.println("Scaled by " + scaleFactor);
            System.out.println("Scaled area: " + shape.area());
            System.out.println("Scaled perimeter: " + shape.perimeter());
            System.out.println();
        }
    }
}