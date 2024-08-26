package basicArithmetic;

import java.util.ArrayList;
import java.util.List;

public class MaxChangeCalculator {
	
	public int calcMaxPossibleChange(final List<Integer> values) {
		List<Integer> sortedValues = new ArrayList<Integer>(values);
		sortedValues.sort(Integer::compareTo);
		int maxValue = values.get(0);
		
		
		return maxValue;
	}

}
