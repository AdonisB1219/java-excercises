package basicArithmetic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class BasicMethodsTest {
	@ParameterizedTest(name = "getPrimes({0}) = {1}")
	@MethodSource("primes")
	void getPrimes(int maxValue, List<Integer> expectedPrimes) {
		List<Integer> primes = BasicMethods.getPrimes(maxValue);
		assertEquals(primes, expectedPrimes);
	}
	
	private static Stream<Arguments> primes() {
		return Stream.of(Arguments.of(2, List.of(2)),
				Arguments.of(10, List.of(2, 3, 5, 7)),
				Arguments.of(50, List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47))
				);
	}
	

}
