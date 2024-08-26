package recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class AlgorithmicRecursionsTest {
	
	@ParameterizedTest(name = "isPalindrome({0}) = {1}")
	@MethodSource("potencialPalindromes")
	public void isPalindrome(int[] values, boolean expected) {
		boolean result = AlgorithmicRecursions.isPalindrome(values);
		assertEquals(expected, result);
	}
	
	private static Stream<Arguments> potencialPalindromes(){
		return Stream.of(Arguments.of(new int[]{1, 3, 5, 12, 6, 7}, false), 
				Arguments.of(new int[]{7, 6, 12, 12, 6, 7}, true),
				Arguments.of(new int[]{1}, true));
	}
	
}
