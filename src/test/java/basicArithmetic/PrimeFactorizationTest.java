package basicArithmetic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class PrimeFactorizationTest {
	@ParameterizedTest(name = "calcPrimeFactors({0}) = {1}")
	@MethodSource("valueAndPrimeFactors")
	void calcPrimeFactors(int value, List<Integer> expected) {
		List<Integer> result = PrimeFactorization.calcPrimeFactors(value);
		assertEquals(result, expected);
	}
	
	private static Stream<Arguments> valueAndPrimeFactors() {
		return Stream.of(Arguments.of(8, List.of(2, 2, 2)),
				Arguments.of(14, List.of(2, 7)),
				Arguments.of(42, List.of(2, 3, 7)),
				Arguments.of(1155, List.of(3, 5, 7, 11))
				);
	}
}
