
package combinations;

import java.util.HashMap;
import java.util.Map;

class Combinations {
	
	static Map<Character, Integer> strIntMap = new HashMap<>();
	static int finalDivisor = 1;

	public static int numberOfPossibleCombinations(char[] strArr) {
		
		int length = strArr.length;
		
		for(int i = 0; i < length; i++) {
			if(!strIntMap.containsKey(strArr[i])) {
				strIntMap.put(strArr[i], 1);
			}else {
				strIntMap.put(strArr[i], strIntMap.get(strArr[i])+1);
			}
		}
		
		strIntMap.entrySet().forEach(x->{
			if(x.getValue()!=0) finalDivisor *= factorial(x.getValue());
		});
		
		int result = factorial(length)/finalDivisor;
		
		return result;
	}
	
	//Method which returns factorial of number. n! = n(n-1)(n-2)...(n)
	public static int factorial(int x) {
		if(x == 1) {
			return 1;
		}else {
			return x*factorial(x-1);
		}
	}
}
