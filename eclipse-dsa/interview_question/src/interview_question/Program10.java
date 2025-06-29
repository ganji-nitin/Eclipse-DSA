package interview_question;

import java.util.Arrays;
import java.util.List;

public class Program10 {

	public static void main(String[] args) {

		Emp[] emp = { new Emp(101, "A", 150000), new Emp(102, "B", 10000), new Emp(103, "C", 12000),
				new Emp(104, "D", 20000), new Emp(105, "E", 180000) };
		
		List<Emp> list = Arrays.asList(emp);
		
		Emp maxEmpSal = list.stream().max((e1,e2) -> (int) e1.empSalary - (int) e2.empSalary).get();
		
		System.out.println(maxEmpSal);
		
		Emp minEmpSal = list.stream().min((e1,e2) -> (int) e1.empSalary - (int) e2.empSalary).get();
		
		System.out.println(minEmpSal);
		
	}
}
