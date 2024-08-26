package recursion;

public class ReverseString {
	
	public static String reverseString(String text) {
		if (text.length() == 1) {
			return text;
		} else {
			String remaining = text.substring(0, text.length() - 1);
			return text.charAt(text.length() - 1) + reverseString(remaining);
		}
	}

}
