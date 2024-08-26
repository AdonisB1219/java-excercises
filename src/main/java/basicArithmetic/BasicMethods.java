package basicArithmetic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicMethods {
	public static List<Integer> findRealDivisors(final int value) {
		List<Integer> divisors = new ArrayList<Integer>();
		for (int i = 1; i <= value / 2; i++) {
			if (value % i == 0) {
				divisors.add(i);
			}
		}
		return divisors;
	}
	
	private static boolean[] sieveOfErastothenes(int maxValue){
		boolean[] isPrime = new boolean[maxValue + 1];
		Arrays.fill(isPrime, true);
		isPrime[0] = false;
		isPrime[0] = false;
		for (int p = 2; p * p <= maxValue; p++) {
			if (isPrime[p]) {
				for (int i = p * p; i <= maxValue; i+=p) {
					isPrime[i] = false;
				}
			}
		}
		
		return isPrime;
	
	}
	
	public static List<Integer> getPrimes(int maxValue){
		boolean[] isPrime = sieveOfErastothenes(maxValue);
		List<Integer> primes = new ArrayList<Integer>();
		for (int i = 2; i <= maxValue; i++) {
			if (isPrime[i]) {
				primes.add(i);
			}
		}
		
		return primes;
	}
}
