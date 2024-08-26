package recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

public class MathematicalRecursionsTest {
	
	@ParameterizedTest(name = "factorial({0}) = {1}")
	@CsvSource({"4, 24", "5, 120", "8, 40320"})
	public void factorial(int n, int expected) {
		int result = MathematicalRecursions.factorial(n);
		assertEquals(result, expected);
	}
	
	@ParameterizedTest(name = "sumNumbers({0}) = {1}")
	@CsvSource({"1, 1", "5, 15", "8, 36"})
	public void sumNumbers(int n, int expected) {
		int result = MathematicalRecursions.sumNumbers(n);
		assertEquals(result, expected);
	}
	
	@ParameterizedTest(name = "fibonacci({0}) = {1}")
	@CsvSource({"1, 1", "2, 1", "8, 21"})
	public void fibonacci(int n, int expected) {
		int result = MathematicalRecursions.fibonacci(n);
		assertEquals(result, expected);
	}


}
