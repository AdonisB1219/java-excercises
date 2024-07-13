package basicArithmetic;

public class Combinatorics {
	public void exerciseA() {
		for (int c = 1; c <= 100; c++) {
			for (int a = 1; a < 100; a++) {
				double b = Math.sqrt((c*c) - (a*a));
				if ( b == Math.floor(b) && b > 0) {
					System.out.println(a * a + " + " + b * b + " = " + c* c);
				}
			}
		}
	}
	
	public void exerciseB() {
		for (int d = 1; d < 100; d++) {
			for (int c = 1; c <= 100; c++) {
				for (int a = 1; a < 100; a++) {
					double b = Math.sqrt((c * c) + (d * d) - (a * a));
					if (b == Math.floor(b) && b > 0) {
						System.out.println(a * a + " + " + b * b + " = " + c * c + " + " + d * d);
					}
				}
			} 
		}
	}
}
