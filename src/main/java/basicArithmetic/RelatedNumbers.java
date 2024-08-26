package basicArithmetic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RelatedNumbers {
	public static Map<Integer, Integer> calcFriends(int maxValue){
		Map<Integer, Integer> friends = new HashMap<Integer, Integer>();
		for (int number1 = 2; number1 < maxValue; number1++) {
			List<Integer> divisors1 = BasicMethods.findRealDivisors(number1);
			int divisors1Sum = divisors1.stream().mapToInt(n -> n).sum();
			
			List<Integer> divisors2 = BasicMethods.findRealDivisors(divisors1Sum);
			int divisors2Sum = divisors2.stream().mapToInt(n -> n).sum();
			if (number1 == divisors2Sum && divisors2Sum != divisors1Sum) {
				friends.put(number1, divisors1Sum);
			}
		}
		return friends;
	}
}
