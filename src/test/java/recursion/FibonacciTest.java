package recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FibonacciTest {
	
	@ParameterizedTest(name = "fibRec({0}) = {1}")
	@CsvSource("1, 1, 2, 1, 3, 2, 6, 8, 8, 21")
	public void fibonacci(int value, long expected) {
		long result = Fibonacci.fibRec(value);
		assertEquals(expected, result);
	}
	
	@ParameterizedTest(name = "fibIter({0}) = {1}")
	@CsvSource("1, 1, 2, 1, 3, 2, 6, 8, 8, 21")
	public void fibonacciIterative(int value, long expected) {
		long result = Fibonacci.fibIter(value);
		assertEquals(expected, result);
	}
	
	

}
