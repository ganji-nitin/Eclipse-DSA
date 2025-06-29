package java_util;

public interface Car {
	void start();
}

class Audi implements Car {
	public void start() {
		System.out.println("Audi - Starts");
	}
	public void gps() {
		System.out.println("Audi - GPS");
	}
}

class Mercedes implements Car {
	public void start() {
		System.out.println("Merc - Starts");
	}
	public void gps() {
		System.out.println("Merc - GPS");
	}
}

class RollsRoyce implements Car {
	public void start() {
		System.out.println("RollsRoyce - Starts");
	}
	public void gps() {
		System.out.println("RollsRoyce - GPS");
	}
}