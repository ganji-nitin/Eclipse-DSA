package dsa;

import java.util.Comparator;

public class ComId implements Comparator<Object>{
	
	@Override
	public int compare(Object o1, Object o2) {

		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;
		return e1.empId - e2.empId;
	}
}
