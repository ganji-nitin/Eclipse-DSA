package interview_question;

import java.util.Arrays;
import java.util.List;

public class Program2 {

	public static void main(String[] args) {
		Emp[] emp = { new Emp(101, "A", 15000), new Emp(102, "B", 10000), new Emp(103, "C", 12000),
				new Emp(104, "D", 20000), new Emp(105, "E", 18000) };
		
		
		//using map method
		
		List<Emp> list = Arrays.asList(emp);
		
		// 5% bonus to every employee for 1 month
		
		list.stream().map((e) -> e.empSalary+((e.empSalary/100)*5)).forEach((e) -> {
			System.out.println(e);
		});
		
	}
}
