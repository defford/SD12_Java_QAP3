public class ScalableTriangle extends ScalableShape {
    protected double a, b, c;
    
    public ScalableTriangle(String name, double a, double b, double c) {
        super(name);
        if (a < b + c && b < a + c && c < a + b) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            throw new IllegalArgumentException("Invalid triangle dimensions");
        }
    };
    
    public double getA() {
        return this.a;
    };

    public void setA(double a) {
        if (a < this.b + this.c) {
            this.a = a;
        } else {
            throw new IllegalArgumentException("Invalid triangle dimension");
        }
    };

    public double getB() {
        return this.b;
    };

    public void setB(double b) {
        if (b < this.a + this.c) {
            this.b = b;
        } else {
            throw new IllegalArgumentException("Invalid triangle dimension");
        }
    };

    public double getC() {
        return this.c;
    };

    public void setC(double c) {
        if (c < this.a + this.b) {
            this.c = c;
        } else {
            throw new IllegalArgumentException("Invalid triangle dimension");
        }
    };

    public double perimeter() {
        return this.a + this.b + this.c;
    };

    public double area() {
        double s = (this.a + this.b + this.c) / 2;
        return Math.sqrt(s * (s - this.a) * (s - this.b) * (s - this.c));
    };

    @Override
    public void scale(double factor) {
        this.a *= factor;
        this.b *= factor;
        this.c *= factor;
    };
}
