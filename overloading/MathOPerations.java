package overloading;

public class MathOPerations {

	    // Addition
	    public static int add(int a, int b) {
	        return a + b;
	    }

	    public static double add(double a, double b) {
	        return a + b;
	    }

	    // Subtraction
	    public static int subtract(int a, int b) {
	        return a - b;
	    }

	    public static double subtract(double a, double b) {
	        return a - b;
	    }

	    // Multiplication
	    public static int multiply(int a, int b) {
	        return a * b;
	    }

	    public static double multiply(double a, double b) {
	        return a * b;
	    }

	    // Division
	    public static int divide(int a, int b) {
	        if (b == 0) {
	            throw new ArithmeticException("Cannot divide by zero");
	        }
	        return a / b;
	    }

	    public static double divide(double a, double b) {
	        if (b == 0.0) {
	            throw new ArithmeticException("Cannot divide by zero");
	        }
	        return a / b;
	    }

	    public static void main(String[] args) {
	        // Testing methods
	        System.out.println("Addition: " + add(5, 3));
	        System.out.println("Addition: " + add(5.2, 3.8));
	        System.out.println("Subtraction: " + subtract(10, 4));
	        System.out.println("Subtraction: " + subtract(10.5, 4.2));
	        System.out.println("Multiplication: " + multiply(6, 7));
	        System.out.println("Multiplication: " + multiply(6.5, 7.5));
	        System.out.println("Division: " + divide(20, 4));
	        System.out.println("Division: " + divide(20.5, 4.1));
	    }
	}


