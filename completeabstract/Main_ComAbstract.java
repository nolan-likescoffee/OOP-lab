public class Main_ComAbstract {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}

interface Shape {
    void draw();   // abstract method by default
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}