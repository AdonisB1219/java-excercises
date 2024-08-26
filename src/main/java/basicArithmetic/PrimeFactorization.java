package basicArithmetic;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {
	public static List<Integer> calcPrimeFactors(final int value){
		int currentValue = value;
		List<Integer> primes = BasicMethods.getPrimes(value);

		List<Integer> factors = new ArrayList<Integer>();
		while (currentValue != 1) {
			for (int prime: primes) {
				if (currentValue % prime == 0) {
					factors.add(prime);
					currentValue /= prime;
					break;
				}
			}
		}
		return factors;
	}
}
