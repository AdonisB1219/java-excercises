package recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class NumberConversionsTest {
	
	@ParameterizedTest (name = "toBinary({0}) = {1}")
	@CsvSource({"5, 101", "7, 111", "22, 10110", "42, 101010", "256, 100000000"})
	public void toBinary(int decimal, String expected) {
		String result = NumberConversions.toBinary(decimal);
		assertEquals(expected, result);
	}
}
