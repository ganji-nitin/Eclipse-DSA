package java_util;

public class Integer {

	private int num;

	public Integer() {
	}
	public Integer(int num) {
		this.num = num;
	}
	public int intValue() {
		return num;
	}
	public void valueOf(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return this.num+"";
	}
	
}
