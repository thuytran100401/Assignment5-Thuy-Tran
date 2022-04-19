/**
 * Shape class:
 * 
 * @author Thuy Tran
 *         April 19, 2022
 */

public class Shape extends Thread {
    private double area;

    // Default constructor
    public Shape() {
    }

    // Thread run method
    public void run() {
        try {
            computeArea();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void computeArea() {
    }

}