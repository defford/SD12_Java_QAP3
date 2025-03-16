public class Circle extends Shape {
    protected double radius;
    
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    };

    public double getRadius() {
        return this.radius;
    };

    public void setRadius(double radius) {
        this.radius = radius;
    };

    public double perimeter() {
        return 2 * Math.PI * radius;
    };

    public double area() {
        return Math.PI * radius * radius;
    };
}