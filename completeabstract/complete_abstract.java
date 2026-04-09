interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double area() {
        return 3.14 * radius * radius;
    }
    @Override
    public double  perimeter() {
        return 2 * 3.14 * radius;
    }    
}

class Rectangle implements Shape {
    double length, breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public double area() {
        return length * breadth;
    }
    @Override
    public double perimeter() {
        return 2 * (length + breadth);
    }
}

public class complete_abstract{
    public static void main(String[] args) {
        Shape c = new Circle(8);
        Shape r  = new Rectangle(4 , 7);

        System.out.println("Area of circle: "+c.area());
        System.out.println("Perimeter of circle: "+c.perimeter());

        System.out.println("Area of Rectangle: "+r.area());
        System.out.println("Perimeter of circle: "+r.perimeter());
    }
}