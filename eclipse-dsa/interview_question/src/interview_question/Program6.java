package interview_question;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Program6 {
	
	
	//convert list to set

	public static void main(String[] args) {

		Integer[] itr = { 1, 4, 2, 5, 3, 2, 1 };
		List<Integer> list = Arrays.asList(itr);
		
		list.stream().collect(Collectors.toSet()).forEach((n)->{
			System.out.println(n);
		});
		
		list.stream().filter((n) -> n < 3).forEach(n->{
			System.out.println(n);
		});
		
	 	Set<Integer> set = task(list);
		 System.out.println(set);
		 

	}

	public static Set<Integer> task(List<Integer> list) {

		Set<Integer> set = list.stream().filter((n) -> n < 3).collect(Collectors.toSet());

		return set;
	}

}
