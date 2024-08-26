package recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CountDigitsTest {
	
	@ParameterizedTest(name = "countDigits({0}) = {1}")
	@CsvSource("1234, 4, 1234567, 7")
	public void countDigits(int value, int numberOfDigits) {
		int result = CountDigits.countDigits(value);
		assertEquals(numberOfDigits, result);
	}
	
	@ParameterizedTest(name = "crossSum({0}) = {1}")
	@CsvSource("1234, 10, 1234567, 28")
	public void crossSum(int value, int expected) {
		int result = CountDigits.crossSum(value);
		assertEquals(expected, result);
	}

}
