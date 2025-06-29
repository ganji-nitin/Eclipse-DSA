package interview_question;

import java.util.Arrays;
import java.util.List;

public class Program3 {

	public static void main(String[] args) {
		
		Emp[] emp = { new Emp(101, "A", 150000), new Emp(102, "B", 10000), new Emp(103, "C", 12000),
				new Emp(104, "D", 20000), new Emp(105, "E", 180000) };
		
		List<Emp> list = Arrays.asList(emp);
		
		// using filter and map method
		
		list.stream().filter((e)->e.empSalary<=50000).map((e) -> e.empSalary+(e.empSalary/100)*10).forEach((e)
				->{
					System.out.println(e);
				}
				);
	}
}
