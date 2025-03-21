public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    };

    public String getName() {
        return this.name;
    };

    public void setName(String name) {
        this.name = name;
    };
    
    public abstract double perimeter();
    public abstract double area();
}