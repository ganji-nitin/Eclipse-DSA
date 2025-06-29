package anagram;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		String s1 = "race";
		String s2 = "care";
		
		if(anagram(s1, s2)) {
			System.out.println("Anagram Strings");
		}
		else
			System.out.println("Not Anagram Strings");
		
	}

	public static boolean anagram(String s1, String s2) {

		if (s1.length() != s2.length()) return false;
		
		char [] ch1 = s1.toCharArray();
		char [] ch2 = s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		String r1 = new String(ch1);
		String r2 = new String(ch2);
		
		return r1.equals(r2);

	}
}
