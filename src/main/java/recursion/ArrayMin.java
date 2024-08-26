package recursion;

import java.util.Arrays;

public class ArrayMin {
	public static int min(int[] numbers) {
		if (numbers.length == 0) {
			return Integer.MAX_VALUE;
		} 
		else if (numbers.length == 1) {
			return numbers[0];
		} else {
			if (numbers[0] < numbers[1]) {
				numbers[1] = numbers[0];
			}
			int[] newArray = Arrays.copyOfRange(numbers, 1, numbers.length);
			return min(newArray);
		}
	}
}
