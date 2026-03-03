class protected {

    // protected method
    protected void startEngine() {
        System.out.println("Engine started");
    }

    public static void main(String[] args) {

        System.out.println("This is protected access modifier example");

        Vehicle v = new Vehicle();
        v.startEngine();   // Allowed (same class)
    }
}

