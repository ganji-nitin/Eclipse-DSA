package interview_question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program5 {

	public static void main(String[] args) {
		
		Emp[] emp = { new Emp(101, "A", 150000), new Emp(102, "B", 10000), new Emp(103, "C", 12000),
				new Emp(104, "D", 20000), new Emp(105, "E", 180000) };
		
		List<Emp> list = Arrays.asList(emp);
		
		// creating a list whose salary is greater than 50000
		
		List<Emp> res = list.stream().filter((e) -> e.empSalary>50000).collect(Collectors.toList());
		
		System.out.println(res);
	}
}
