
/**
 * ShapeTest class:
 *      should implement main().
 *      the body of the main() method instantiate an object of Shapes.
 *      instantiate at least 2 objects of each shape type (at least 8 shapes) and add to Shapes
 *      Make a call to compute() method in class Shapes.
 * 
 * @author Thuy Tran
 * April 19, 2022
 */

import java.util.ArrayList;

public class ShapeTest {

    public static void main(String[] args) {

        // instantiate an object of Shapes
        Shapes shapes = new Shapes(new ArrayList<Shape>());

        shapes.add(new Triangle(7, 9));
        shapes.add(new Triangle(10, 7));
        shapes.add(new Circle(8));
        shapes.add(new Circle(9));
        shapes.add(new Rectangle(15, 18));
        shapes.add(new Rectangle(5, 12));
        shapes.add(new Hexagon(6));
        shapes.add(new Hexagon(10));

        shapes.compute();

        System.out.println("\nMax Area: " + shapes.max().toString());
        System.out.println("Min Area: " + shapes.min().toString());

    }
}
