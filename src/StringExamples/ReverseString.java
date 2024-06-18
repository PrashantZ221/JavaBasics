package StringExamples;

import java.util.HashMap;
import java.util.LinkedHashMap;

class ReverseString {
	public static void main(String[] args) {
		String s = "Prashant";
		String rev = "";
				
		for(int i = s.length()-1; i >= 0; i--){
			rev = rev + s.charAt(i);
		}

		System.out.println("Reverse string is :" + rev);

		//Number of characters

		String str = "AEAIOG";
		HashMap<Character, Integer> hMap = new HashMap();
		hMap.put('A', 0);
		hMap.put('E', 0);
		hMap.put('I', 0);
		hMap.put('O', 0);
		hMap.put('U', 0);
		for (int i = 0; i <= str.length() - 1; i++) {
			if (hMap.containsKey(str.charAt(i))) {
				int count = hMap.get(str.charAt(i));
				hMap.put(str.charAt(i), ++count);
			}
		}
		System.out.println(hMap);
		
	}
}