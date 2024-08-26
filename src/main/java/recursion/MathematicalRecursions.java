package recursion;

public class MathematicalRecursions {
	public static int factorial (final int n) {
		if (n < 0) {
			throw new IllegalArgumentException("No existe factorial para n < 0");
		}
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static int sumNumbers(final int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Se debe ingresar un número positivo.");
		}
		if (n == 0) {
			return 0;
		}
		return n + sumNumbers(n - 1);
	}
	
	public static int fibonacci(final int n) {
		if(n == 0) {
			return 0;
		}
		if(n == 1 || n == 2) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
}
