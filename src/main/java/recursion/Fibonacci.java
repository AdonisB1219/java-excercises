package recursion;

public class Fibonacci {
	public static long fibRec(final int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1 || n == 2) {
			return 1;
		} 
		
		return fibRec(n - 1) + fibRec(n - 2);
	}
	
	public static long fibIter(final int n) {
		int counter = 1;
		long result = 0;
		long temp = 0;
		while (counter <= n ) {
			if (counter == 1 || counter == 2) {
				result = 1;
			} 
			else if(counter == 3) {
				result = 2;
				temp = 1; 
			} else {
				long temp2 = temp;
				result += temp;
				temp = temp2;
			}
			counter++;
		}
		return result;
	}
}
