abstract class Shape {
    abstract void calculateArea();
}

class Rectangle extends Shape {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void calculateArea() {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class partialabstractArea {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(10, 5);
        Shape s2 = new Circle(7);

        s1.calculateArea();
        s2.calculateArea();
    }
}