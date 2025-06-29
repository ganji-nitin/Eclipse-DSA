package dsa;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		Employee[] emp = { new Employee("Nitin", 203, 2000000), new Employee("Kushi", 201, 6000000),
				new Employee("Honey", 202, 5000000) };

		System.out.println(Arrays.toString(emp));

		Arrays.sort(emp, new ComId());

		System.out.println(Arrays.toString(emp));

		Arrays.sort(emp, new ComSal());

		System.out.println(Arrays.toString(emp));

		Arrays.sort(emp, new ComName());

		System.out.println(Arrays.toString(emp));
	}

}
