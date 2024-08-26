package recursion;

public class LCM {
	
	public static int lcm(int a, int b) {
		return a *b / GDC.gdc(a, b);
	}

}
