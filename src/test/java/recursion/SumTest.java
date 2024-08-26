package recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SumTest {
	
	@ParameterizedTest(name = "sum({0} = {1}")
	@MethodSource(value = "valuePairs")
	public void sum(int[] numbers, int expected) {
		int sum = Sum.sum(numbers);
		assertEquals(sum, expected);
	}
	
	public static Stream<Arguments> valuePairs() {
		return Stream.of(Arguments.of(new int[] {1, 2, 3}, 6), Arguments.of(new int[] {1, 2, 3, -7}, -1));
	}

}
