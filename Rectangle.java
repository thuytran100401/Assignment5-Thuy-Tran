/**
 * Rectangle class:
 * have getters and setters defined and implemented for all the attributes.
 * hould have at least one non-default constructor implemented to
 * allow instantiating an object with appropriate attributes
 * should have toString() method implemented
 * 
 * @author Thuy Tran
 *         April 19, 2022
 */

public class Rectangle extends Shape {

    private double width, height;

    /**
     * Constructor of Rectangle class
     * 
     * @param width  the width of a Rectangle
     * @param height the height of a Rectangle
     */
    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    /**
     * Getting the width of Rectangle
     * 
     * @return the width of a Rectangle
     */
    public double getWidth() {
        return width;
    }

    /**
     * Getting the height of Rectangle
     * 
     * @return the height of a Rectangle
     */
    public double getHeight() {
        return height;
    }

    /**
     * Assign a width to a Rectangle
     * 
     * @param base the width of a Rectangle
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Assign a height to a Rectangle
     * 
     * @param height the height of a Rectangle
     */
    public void setHeight(double height) {
        this.height = height;
    }

    // Calculate the area of Rectangle and print it out
    @Override
    public void computeArea() {
        double area = width * height;
        super.setArea(area);
        System.out.println("Area of Rectangle: " + area);

    }

    /**
     * Convert a Rectangle into a string
     * in the format:
     * Rectangle width: <width>, height: <height>, area: <super.getArea()>
     */
    @Override
    public String toString() {
        return "Rectangle width: " + width + ", height: " + height + ", arae: " + super.getArea();
    }
}
