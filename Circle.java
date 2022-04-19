/**
 * Circle class:
 * have getters and setters defined and implemented for all the attributes.
 * hould have at least one non-default constructor implemented to
 * allow instantiating an object with appropriate attributes
 * should have toString() method implemented
 * 
 * @author Thuy Tran
 *         April 19, 2022
 */

public class Circle extends Shape {
    private double radius;

    /**
     * Constructor of Circle class
     * 
     * @param radius radius of a circle
     */
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    /**
     * Getting the radius circle
     * 
     * @return the radius of circle
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Assign a radius to a circle
     * 
     * @param radius radius of a circle
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Convert a circle into String
     * in the format:
     * Circle radius: <radius>, area: <super.getArea()>
     */
    @Override
    public String toString() {
        return "Circle radius: " + radius + ", area: " + super.getArea();
    }

    // Calculate area of circle
    @Override
    public void computeArea() {
        double area = Math.PI * (Math.pow(radius, 2));
        super.setArea(area);
        System.out.printf("Are of Cricle: %.2f\n", area);
    }
}
