public class PointDemo {
    public static void main(String[] args) {
        System.out.println("Testing Point class:");
        Point p1 = new Point(1.0f, 2.0f);
        System.out.println("Point p1: " + p1.toString());
        
        float[] coords = p1.getXY();
        System.out.println("X coordinate: " + coords[0]);
        System.out.println("Y coordinate: " + coords[1]);
        
        System.out.println("\nTesting MoveablePoint class:");
        MoveablePoint mp1 = new MoveablePoint(2.0f, 3.0f, 0.5f, 0.5f);
        System.out.println("Initial position: " + mp1.toString());
        
        mp1.move();
        System.out.println("After move 1: " + mp1.toString());
        
        mp1.move();
        System.out.println("After move 2: " + mp1.toString());
        
        mp1.setXSpeed(1.0f);
        mp1.setYSpeed(2.0f);
        System.out.println("After changing speed: " + mp1.toString());
        
        mp1.move();
        System.out.println("After move 3 with new speed: " + mp1.toString());
    }
}