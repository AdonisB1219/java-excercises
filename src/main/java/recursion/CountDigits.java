package recursion;

public class CountDigits {

	public static int countDigits(int value) {
		int remaining = value / 10;
		if (remaining > 0) {
			return 1 + countDigits(remaining);
		}
		else return 1;
	}
	
	public static int crossSum(final int value) {
		int remaining = value / 10;
		int digit = value % 10;
		if (remaining > 0 ) {
			return digit + crossSum(remaining);
		}
		else return digit;
	}
}
