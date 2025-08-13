public class gretestcommondinominator {

    // Method to find the greatest common divisor (GCD) using Euclidean algorithm
    public static int findGCD(int a, int b) {
        // Base case: if b is 0, then a is the GCD
        if (b == 0) {
            return a;
        }
        // Recursive step: GCD(a, b) = GCD(b, a % b)
        return findGCD(b, a % b);
    }

    public static void main(String[] args) {
        // Test cases
        int num1 = 48;
        int num2 = 18;
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + findGCD(num1, num2)); // Expected: 6

        num1 = 101;
        num2 = 103;
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + findGCD(num1, num2)); // Expected: 1

        num1 = 56;
        num2 = 0;
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + findGCD(num1, num2)); // Expected: 56

        num1 = 0;
        num2 = 42;
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + findGCD(num1, num2)); // Expected: 42

        num1 = 99;
        num2 = 88;
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + findGCD(num1, num2)); // Expected: 11
    }
}