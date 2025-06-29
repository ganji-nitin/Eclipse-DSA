package interview_question;

import java.util.Arrays;
import java.util.List;

public class Program8 {

	public static void main(String[] args) {
		String s = "Java";
		
		System.out.println(s.length());
		
		char[] ch = s.toCharArray();
		
		System.out.println(ch.length);
		
		int count = 0;
		
		for(char c : ch) {
			count++;
		}
		
		System.out.println(count);
		
		List<char []> list = Arrays.asList(ch);
		for(char[] c : list) {
			System.out.println(c);
		}
		
		int i = (int) list.stream().count();
		
		System.out.println(i);
		
	}
}
