package dsa;

public class Employee {
	
	String empName;
	int empId;
	double empSal;
	public Employee(String empName, int empId, double empSal) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empSal=" + empSal + "]";
	}
	
	
}
