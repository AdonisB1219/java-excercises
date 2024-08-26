package recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class LCMTest {
	
	@ParameterizedTest(name = "lcm({0}) = {0}")
	@CsvSource({"2, 7, 14", "7, 14, 14", "42, 14, 42"})
	public void lcm(int a, int b, int expected) {
		int result = LCM.lcm(a, b);
		assertEquals(expected, result);
	}
}
