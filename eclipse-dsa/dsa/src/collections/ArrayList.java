package collections;

public class ArrayList {

	private Object [] obj;
	private int capacity;
	private int pos;
	
	public ArrayList() {

		capacity = 10;
		obj = new Object[capacity];
	}
	
	public int getCapacity() {
		return capacity;
	}
}
