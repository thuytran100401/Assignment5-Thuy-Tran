/**
 * Triangle class:
 * have getters and setters defined and implemented for all the attributes.
 * hould have at least one non-default constructor implemented to
 * allow instantiating an object with appropriate attributes
 * should have toString() method implemented
 * 
 * @author Thuy Tran
 *         April 19, 2022
 */

public class Triangle extends Shape {
    private double height, base;

    /**
     * Constructor of Triangle class
     * 
     * @param base   the base of a triangle
     * @param height the height of a triangle
     */
    public Triangle(double base, double height) {
        super();
        this.base = base;
        this.height = height;
    }

    /**
     * Getting the base of triangle
     * 
     * @return the base of a triangle
     */
    public double getBase() {
        return base;
    }

    /**
     * Getting the height of triangle
     * 
     * @return the height of a triangle
     */
    public double getHeight() {
        return height;
    }

    /**
     * Assign a base to a triangle
     * 
     * @param base the base of a triangle
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * Assign a height to a Triangle
     * 
     * @param height the height of a Triangle
     */
    public void setHeight(double height) {
        this.height = height;
    }

    // Calculate the area of Triangle and print it out
    @Override
    public void computeArea() {
        double area = (base * height) / 2;
        super.setArea(area);
        System.out.println("Area of Triangle: " + area);
    }

    /**
     * Convert a Triangle into a string
     * in the format:
     * Triangle base: <base>, height: <height>, area: <super.getArea()>
     */
    @Override
    public String toString() {
        return "Triangle base: " + base + ", height: " + height + ", area: " + super.getArea();
    }
}