/**
 * Hexagon class:
 * have getters and setters defined and implemented for all the attributes.
 * hould have at least one non-default constructor implemented to
 * allow instantiating an object with appropriate attributes
 * should have toString() method implemented
 * 
 * @author Thuy Tran
 *         April 19, 2022
 */

public class Hexagon extends Shape {
    private double side;

    /**
     * Constructor of Hexagon class
     * 
     * @param side side of a Hexagon
     */
    public Hexagon(double side) {
        super();
        this.side = side;
    }

    /**
     * Getting the side Hexagon
     * 
     * @return the side of Hexagon
     */
    public double getSide() {
        return side;
    }

    /**
     * Assign a side to a Hexagon
     * 
     * @param side side of a Hexagon
     */
    public void setRadius(double side) {
        this.side = side;
    }

    /**
     * Convert a Hexagon into String
     * in the format:
     * Hexagon side: <side>, area: <super.getArea()>
     */
    @Override
    public String toString() {
        return "Hexagon side: " + side + ", area: " + super.getArea();
    }

    // Calculate area of Hexagon
    @Override
    public void computeArea() {
        double area = ((3 * Math.sqrt(3)) / 2) * (Math.pow(side, 2));
        super.setArea(area);
        System.out.printf("Are of Hexagon: %.2f\n", area);
    }
}
