public abstract class ScalableShape implements Scalable {
    protected String name;

    public ScalableShape(String name) {
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