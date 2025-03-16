public class EquilateralTriangle extends Shape {
    protected double side;
    
    public EquilateralTriangle(String name, double side) {
        super(name);
        this.side = side;
    }; 

    public double getSide() {
        return this.side;
    };

    public void setSide(double side) {
        this.side = side;
    };

    public double perimeter() {
        return 3 * this.side;
    };

    public double area() {
        double s = (this.side * 3) / 2;
        return Math.sqrt(s * (s - this.side) * (s - this.side) * (s - this.side));
    };
}
