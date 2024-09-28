class Circle {
    public int radius;

    Circle() {
        System.out.println("I am non parametrize circle  constructor");
     }
    Circle(int r) {
        System.out.println("I am parametrize circle  constructor");
        this.radius = r;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle {
    public int height;

    Cylinder(int r, int h) {
        super(r);
        System.out.println("I am parametrize cylinder constructor");
        this.height = h;
    }

    public double volume() {
        return area() * height;
    }
}


class Radius {
    public static void main(String[] args) {
        // Circle obj1 = new Circle(12);
        Cylinder obj2 = new Cylinder(5, 10);
    }
}