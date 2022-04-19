
/**
 * Shapes class:
 *      should have a private ArrayList attribute that can contain shapes (any shape)
 *      Add the ability to add and remove objects from this attribute using methods add() and remove()
 *      should have at least one constructor implemented.
 *      should also implement a getter and a setter for shapeList.
 * 
 * @author Thuy Tran
 * April 19, 2022
 */

import java.util.ArrayList;

public class Shapes {
    private ArrayList<Shape> shapeList = new ArrayList<Shape>();

    /**
     * Constructor of Shapes class
     * 
     * @param shapeList the list of shapes
     */
    public Shapes(ArrayList<Shape> shapeList) {
        this.shapeList = shapeList;
    }

    /**
     * Getting the shape list
     * 
     * @return the list of shapes
     */
    public ArrayList<Shape> getShapeList() {
        return shapeList;
    }

    /**
     * Assign a list of shape to the list
     * 
     * @param shapeList the list of shape
     */
    public void setShapeList(ArrayList<Shape> shapeList) {
        this.shapeList = shapeList;
    }

    // Adding a shape into shape list
    public void add(Shape s) {
        shapeList.add(s);
    }

    // Remove a shape from shape list
    public void remove(Shape s) {
        shapeList.remove(s);
    }

    // compute all areas and print
    public synchronized void compute() {
        for (Shape s : shapeList) {
            s.start();
        }
    }

    public Shape max() {
        double maxArea = 0;
        Shape maxShape = null;
        for (Shape s : shapeList) {
            if (s.getArea() > maxArea) {
                maxArea = s.getArea();
                maxShape = s;
            }
        }
        return maxShape;
    }

    public Shape min() {
        Shape minShape = shapeList.get(0);
        for (Shape s : shapeList) {
            if (minShape.getArea() > s.getArea()) {
                minShape = s;
            }
        }

        return minShape;
    }
}