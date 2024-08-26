package recursion;

import java.util.Arrays;

public class Sum {
	public static int sum(int[] numbers) {
		if (numbers.length == 1) {
			return numbers[0];
		} else {
			int[] remaining = Arrays.copyOf(numbers, numbers.length - 1);
			return numbers[numbers.length - 1] + sum(remaining);
		}
	}
}
