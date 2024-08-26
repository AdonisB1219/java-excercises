package recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ReverseStringTest {
	
	@ParameterizedTest(name = "reverseString({0}) = {1}")
	@MethodSource(value = "strings")
	public void reverseStringTest(String text, String expected) {
		String reversedString = ReverseString.reverseString(text);
		assertEquals(reversedString, expected);
	}
	
	public static Stream<Arguments> strings(){
		return Stream.of(Arguments.of("texto", "otxet"), Arguments.of("hola!", "!aloh"));
	}
	
}
