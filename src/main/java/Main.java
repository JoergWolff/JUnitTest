public class Main {
    public static void main(String[] args) {
        int a = 100;
        int b = 4;
        output(a, b);
        double c = 100.00;
        double d = 4.00;
        output(c, d);

    }

    public static void output(int a, int b) {
        System.out.println("int   -----");
        System.out.println("Add: " + addNumbers(a, b));
        System.out.println("Subtract: " + subtractNumbers(a, b));
        System.out.println("Multiply : " + multiplyNumbers(a, b));
        System.out.println("Divide : " + divideNumbers(a, b));
    }

    public static void output(double a, double b) {
        System.out.println("double -----");
        System.out.println("Add: " + addNumbers(a, b));
        System.out.println("Subtract: " + subtractNumbers(a, b));
        System.out.println("Multiply : " + multiplyNumbers(a, b));
        System.out.println("Divide : " + divideNumbers(a, b));
    }

    // Add
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static double addNumbers(double a, double b) {
        return a + b;
    }

    // Subtract
    public static int subtractNumbers(int a, int b) {
        return a - b;
    }

    public static double subtractNumbers(double a, double b) {
        return a - b;
    }

    // Multiply
    public static int multiplyNumbers(int a, int b) {
        return a * b;
    }

    public static double multiplyNumbers(double a, double b) {
        return a * b;
    }

    // Divide
    public static int divideNumbers(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    public static double divideNumbers(double a, double b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

}
