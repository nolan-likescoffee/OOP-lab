class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    protected void display() {
        System.out.println("This is Calculator class display method");
    }
    private void show() {
        System.out.println("This is private show() method in Calculator");
    }

    public void accessPrivate() {
        show();
    }
}

class AdvancedCalculator extends Calculator {
    @Override
    public int add(int a, int b) {
        int result = a + b;
        return result * 2; // modified behavior
    }

    @Override
    protected void display() {
        System.out.println("This is AdvancedCalculator class display method");
    }

    public void show() {
        System.out.println("This is show() method in AdvancedCalculator");
    }
}

public class Calculator_using_inheritance_and_runtime_polymorphism{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Calculator add: " + calc.add(10, 20));
        calc.display();
        calc.accessPrivate();

        System.out.println();
        AdvancedCalculator advCalc = new AdvancedCalculator();
        System.out.println("AdvancedCalculator add: " + advCalc.add(10, 20));
        advCalc.display();
        advCalc.show(); 
        System.out.println();
        Calculator ref = new AdvancedCalculator();
        System.out.println("Polymorphism add: " + ref.add(5, 5));
        ref.display();  
    }
}