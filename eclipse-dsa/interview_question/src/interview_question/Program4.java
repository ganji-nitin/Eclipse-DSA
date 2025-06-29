package interview_question;

import java.util.Arrays;
import java.util.List;

public class Program4 {

	public static void main(String[] args) {
		
		Emp[] emp = { new Emp(101, "A", 150000), new Emp(102, "B", 10000), new Emp(103, "C", 12000),
				new Emp(104, "D", 20000), new Emp(105, "E", 180000) };
		
		List<Emp> list = Arrays.asList(emp);
		
		// count the employees who earning more than 50000
		
		int count = (int) list.stream().filter((e) -> e.empSalary>=50000).count();
		
		System.out.println(count);
		
	}
}
