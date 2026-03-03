// static modifier
class static_example {
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = add(5, 3);   // calling static method directly
        System.out.println("Sum: " + result);
    }
}
