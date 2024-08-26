package recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ArrayminTest {
	
	@ParameterizedTest(name = "min({0}) = {1}")
	@MethodSource(value = "arraysData")
	public void min(int[] numbers, int expected) {
		int result = ArrayMin.min(numbers);
		assertEquals(expected, result);
	}
	
	public static Stream<Arguments> arraysData(){
		return Stream.of(Arguments.of(new int[] {7, 2, 1, 9, 7, 1}, 1), 
				Arguments.of(new int[] {11, 2, 33, 44, 55, 6, 7}, 2),
				Arguments.of(new int[] {1, 2, 3, -7}, -7));
	}
}
