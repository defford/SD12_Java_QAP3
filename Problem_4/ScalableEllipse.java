public class ScalableEllipse extends ScalableShape {

    protected double a;
    protected double b;
    
    public ScalableEllipse(String name, double a, double b) {
        super(name);
        if (a > b) {
            this.a = a;
            this.b = b;
        } else {
            this.a = b;
            this.b = a;
        }
    };
    
    public double getA() {
        return this.a;
    };

    public void setA(double a) {
        if (a > this.b) {
            this.a = a;
        } else {
            this.a = this.b;
            this.b = a;
        }
    };

    public double getB() {
        return this.b;
    };

    public void setB(double b) {
        if (b > this.a) {
            this.b = b;
        } else {
            this.b = this.a;
            this.a = b;
        }
    };

    public double perimeter() {
        return Math.PI * Math.sqrt(2 + (this.a * this.a + this.b * this.b) - ((this.a - this.b) * (this.a - this.b)) / 2);
    };

    public double area() {
        return Math.PI * this.a * this.b;
    };

    @Override
    public void scale(double factor) {
        this.a *= factor;
        this.b *= factor;
    };
}
