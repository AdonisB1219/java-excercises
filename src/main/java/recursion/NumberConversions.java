package recursion;

public class NumberConversions {
	public static String toBinary(int decimal) {
		if (decimal == 1) {
			return "1";
		} else {
			String remainder = String.valueOf(decimal % 2);
			return toBinary(decimal / 2) + remainder;
		}
	}
}
