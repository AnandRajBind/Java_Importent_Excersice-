/**
 * The code defines classes for Rectangle and Cuboid shapes with methods to
 * calculate their area and
 * volume respectively.
 */
class Rectangle1 {
    public int length;
    public int breadth;

    // Using
    // constructor*************************************************************************

    // Rectangle1(int l, int b) {
    // // System.out.println("I am parametrize rectangle constructor");
    // this.length = l;
    // this.breadth = b;
    // }

    // public int area() {
    // return length * breadth;
    // }

    // Using Getter setter method
    // *************************************************************************

    public void setRectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    public int getRectangle() {
        return length * breadth;
    }

}

class Cuboid extends Rectangle1 {
    public int height;
    // Using
    // constructor*************************************************************************

    // Cuboid(int l, int b, int h) {
    // super(10, 15);
    // this.height = h;
    // }

    // public int volume() {
    // return length * breadth * height;
    // }

    // Using Getter setter method
    // *************************************************************************

    public void setCuboid(int l, int b, int h) {

        this.length = l;
        this.breadth = b;
        this.height = h;
    }

    public int getCuboid() {
        return length * breadth * height;
    }

}

public class Rectangle {
    public static void main(String[] args) {
        // Rectangle obj1 = new Rectangle(12, 10);
        // Using Getter setter method
        // *************************************************************************

        Cuboid obj1 = new Cuboid();
        obj1.setCuboid(10, 15, 20);
        System.out.println("The area of rectangle is: " + obj1.getRectangle());
        System.out.println("The volume  of Cuboid is: " + obj1.getCuboid());

        // Using
        // constructor*************************************************************************
        // Cuboid obj1 = new Cuboid(10, 15, 20);
        // System.out.println("The area of rectangle is: " + obj1.area());
        // System.out.println("The volume of Cuboid is: " + obj1.volume());
    }
}
