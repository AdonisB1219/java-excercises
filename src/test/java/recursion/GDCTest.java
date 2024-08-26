package recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GDCTest {
	
	@ParameterizedTest(name = "gdc({0}, {1}) = {2}")
	@CsvSource({"42, 7, 7", "42, 28, 14", "42, 14, 14"})
	public void gdc(int a, int b, int expected) {
		int result = GDC.gdcIterative(a, b);
		assertEquals(expected, result);
	}
	
	@ParameterizedTest(name = "gdc({0}, {1}) = {2}")
	@CsvSource({"42, 7, 7", "42, 28, 14", "42, 14, 14"})
	public void gdcIterative(int a, int b, int expected) {
		int result = GDC.gdcIterative(a, b);
		assertEquals(expected, result);
	}
	
}
