package interview_question;

import java.util.Arrays;
import java.util.List;

public class Program9 {

	public static void main(String[] args) {
		
		// minimum and max values of Integer array
		
		Integer[] itr = { 3, 2, 10, 4, 1, 6, 5 };

		List<Integer> list = Arrays.asList(itr);

		Integer smallest = list.stream().max((n1, n2) -> n1 - n2).get();

		System.out.println(smallest);

		Integer largest = list.stream().min((n1, n2) -> n1 - n2).get();

		System.out.println(largest);
	}
}
