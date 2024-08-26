package recursion;

import java.util.Arrays;

public class AlgorithmicRecursions {
	/*public static boolean isPalindrome(final int[] values) {
		if(values.length <= 1) {
			return true;
		}
		if(values[0] == values[values.length - 1]) {
			final int[] remainder = Arrays.copyOfRange(values, 1, values.length - 1);
			return isPalindrome(remainder);
		}
		return false;
	}*/
	
	public static boolean isPalindrome(final int[] values) {
		return isPalindrome(values, 0, values.length - 1);
	}
	
	public static boolean isPalindrome(final int[] values, int left, int right) {
		if (left >= right) {
			return true;
		}
		if (values[left] == values[right]) {
			return isPalindrome(values, left + 1, right - 1);
		}
		return false;
	}
}
