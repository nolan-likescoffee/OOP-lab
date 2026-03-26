class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    protected int add(int a, int b, int c) {
        return a + b + c;
    }

    private double add(double a, double b) {
        return a + b;
    }

    public void displayDecimalSum(double a, double b) {
        double result = add(a, b);
        System.out.println("Sum of decimal numbers: " + result);
    }
}

public class SoftwareCompany_Calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 integers: " + calc.add(10, 20));
        System.out.println("Sum of 3 integers: " + calc.add(10, 20, 30));
        calc.displayDecimalSum(5.5, 4.5);
    }
}