package testAlgos;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

	public static void main(String[] args) {
		System.out.println(romanToInt("MCMXCIV"));

	}
	
	public static int romanToInt(String s) {
		
		Map<Character,Integer> map = new HashMap<>();		
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		char[] chararr = s.toCharArray();
		
		int result = 0;
		for(int i=0; i<chararr.length; i++) {
			
			if (i < chararr.length -1) {
				if (map.get(chararr[i+1]) > map.get(chararr[i])) {
					result = result + map.get(chararr[i+1]) - map.get(chararr[i]);
					i++;
				}
				else
					result = result + map.get(chararr[i]);
				
			}else
				result = result + map.get(chararr[i]);
			
		}
		
        return result;
    }

}
