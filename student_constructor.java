public class student_constructor{
    String name;
    int age;
    String course;

    student_constructor() {
        name = "Unknown";
        age = 0;
        course = "Not Assigned";
    }

    student_constructor(String n, int a, String c) {
        name = n;
        age = a;
        course = c;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        student_constructor s1 = new student_constructor();
        s1.displayInfo();
        student_constructor s2 = new student_constructor("Alice", 20, "Computer Science");
        s2.displayInfo();
    }
}