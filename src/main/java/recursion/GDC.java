package recursion;

public class GDC {
	public static int gdc(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gdc(b, a % b);
		}
	}
	
	public static int gdcIterative(int a, int b) {
		int remainingA = a;
		int remainingB = b;
		int min = a < b ? a : b;
		int currentDivisor = 2;
		int gdc = 1;
		while (currentDivisor < min) {
			if (remainingA > 0 && remainingA % currentDivisor == 0) {
				if (remainingB > 0 && remainingB % currentDivisor == 0){
					remainingA /= currentDivisor;
					remainingB /= currentDivisor;
					gdc *= currentDivisor;
				}
			}
			currentDivisor++;
		}
		return gdc;
	}
}
