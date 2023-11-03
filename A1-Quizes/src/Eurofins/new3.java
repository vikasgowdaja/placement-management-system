package Eurofins;

import java.util.Arrays;
import java.util.List;

public class new3 {
	static String remVowel(String str) {
		Character vowels[] = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
		List<Character> al = Arrays.asList(vowels);
		StringBuffer sb = new StringBuffer(str);

		for (int i = 0; i < sb.length(); i++) {
			
			if (al.contains(sb.charAt(i))) {
				sb.replace(i, i + 1, "");
				i--;
			}
		}
		return sb.toString();
	}

	// Driver method to test the above function
	public static void main(String[] args) {
		int count = 0;
		String str = "coat";
		Character vowels[] = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
		List<Character> al = Arrays.asList(vowels);
		StringBuffer sb = new StringBuffer(str);

		for (int i = 0; i < sb.length(); i++) {
			
			if (al.contains(sb.charAt(i))) {
				
				count++;
				
			}
		}
	if(count>=2) {	System.out.println(str);
		
	
	
	}
	else {System.out.println(remVowel(str));
		
	}
	}
	}
