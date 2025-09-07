public class FunctionalBasic {

    // Pure function for addition
    static int add(int a, int b) {
        return a + b;
    }

    // Pure function for multiplication
    static int multiply(int a, int b) {
        return a * b;
    }

    // Recursive function (functional style)
    static int factorial(int n) {
        if (n == 0) return 1;   // base case
        return n * factorial(n - 1); // recursive step
    }

    public static void main(String[] args) {
        int x = 5, y = 3;

        System.out.println("Addition: " + add(x, y));
        System.out.println("Multiplication: " + multiply(x, y));
        System.out.println("Factorial of " + x + ": " + factorial(x));
    }
}
