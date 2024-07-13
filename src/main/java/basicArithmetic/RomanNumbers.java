package basicArithmetic;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class RomanNumbers {
	
	private static Map<Integer, String> intToRomanDigitMap =
			Map.of(1, "I", 5, "V", 10, "X", 50, "L",
			100, "C", 500, "D", 1000, "M");
	
	public String toRomanNumbers(final int number) {
		final Comparator<Integer> reversed = Comparator.reverseOrder();
		final Map<Integer, String> sortedIntToRomanDigit = new TreeMap<Integer, String>(reversed);
		sortedIntToRomanDigit.putAll(intToRomanDigitMap);
		
		int remaining = number;
		String romanNumber = "";
		
		Iterator<Map.Entry<Integer, String>> iterator = sortedIntToRomanDigit.entrySet().iterator();
		
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry = iterator.next();
			int multiplier = entry.getKey();
			
			int temporal = remaining / multiplier;
						
			if (temporal > 0 && temporal < 4 ) {
				romanNumber += entry.getValue().repeat(temporal);
				remaining = remaining % multiplier;
			} 
			
			else if (remaining == 4) {
				romanNumber += "IV";
				remaining -= 4;
			} else if (remaining < 50 && remaining >= 40) {
				romanNumber += "XL";
				remaining -= 40;
			} else if (remaining < 100 && remaining >= 90) {
				romanNumber += "XC";
				remaining -= 90;
			} else if (remaining < 500 && remaining >= 400) {
				romanNumber += "CD";
				remaining -= 400;
			} else if (remaining < 1000 && remaining >= 900) {
				romanNumber += "CM";
				remaining -= 900;
			} 
			
					
		}
		
		return romanNumber;
		
		
		
	}
}
