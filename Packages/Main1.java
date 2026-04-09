public class Main1 {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 101);
        s1.display();
    }
}

class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}