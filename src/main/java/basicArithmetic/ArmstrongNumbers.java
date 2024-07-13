package basicArithmetic;

import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumbers {
	public List<Integer> calcArmstrongNumbers(CubicFunction func){
        final List<Integer> results = new ArrayList<>();
		for (int x = 1; x < 10; x++) {
			for (int y = 1; y < 10; y++) {
				for (int z = 1; z < 10 ; z++) {
					final int numericValue = x * 100 + y * 10 + z;
					final int cubicValue = func.calc(x, y, z);
					 if (numericValue == cubicValue) {
	                        results.add(numericValue);
	                    }
				}
			}
		}
		return results;
	}
	
}

@FunctionalInterface
interface CubicFunction {
    int calc(int x, int y, int z);
}
