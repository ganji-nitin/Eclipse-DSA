package interview_question;

import java.util.Arrays;

public class Program7 {

	public static void main(String[] args) {
		
		int [] arr = {1, 4, 5, 2, 3, 6};
		
		System.out.println(Arrays.toString(arr));
		
		// with primitive data type only ascending order is possible
		
		 Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		// with non primitive data type both ascending & descending order is possible
		
		Integer [] itr = {1, 4, 5, 2, 3, 6};
		
		System.out.println(Arrays.toString(itr));
		
		Arrays.sort(itr);
		
		System.out.println(Arrays.toString(itr));
		
		Arrays.sort(itr,(n1,n2) -> n2 - n1);
		
		System.out.println(Arrays.toString(itr));
		
		
		
	}
}
