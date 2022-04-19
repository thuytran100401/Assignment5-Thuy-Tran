
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

        shapes.add(new Triangle(8, 7));
        shapes.add(new Triangle(9, 8));
        shapes.add(new Circle(6));
        shapes.add(new Circle(8));
        shapes.add(new Rectangle(14, 16));
        shapes.add(new Rectangle(3, 10));
        shapes.add(new Hexagon(5));
        shapes.add(new Hexagon(9));

        shapes.compute();

        System.out.println(shapes.max().toString());
        System.out.println(shapes.min().toString());

    }
}
