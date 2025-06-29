package java_util;

public class Test {

//	public static void main(String[] args) {
		
		
		// Car interface exection
//		Car [] car = {new Audi(), new Mercedes(), new RollsRoyce()};
//		
//		for(Car c : car) {
//			c.start();
//		}
//		
//		for(Car c : car) {
//			if(c instanceof Audi) {
//				Audi audi = (Audi)c;
//				audi.start();
//				audi.gps();
//			}
//			else if(c instanceof Mercedes) {
//				Mercedes mercedes = (Mercedes)c;
//				mercedes.start();
//				mercedes.gps();
//			}
//			else {
//				RollsRoyce rollsRoyce = (RollsRoyce)c;
//				rollsRoyce.start();
//				rollsRoyce.gps();
//			}
//		}
//	}
	
	
	
	public static void main(String[] args) {
		// Integer class execution
		
		Integer i = new Integer();
		
		System.out.println(i); //0
		
		int n = 100;
		System.out.println(n); //PT
		
		i.valueOf(n);
		
		System.out.println(i); // NPT
		
		int res = i.intValue(); // Un-Boxing
		System.out.println(res);// PT
	}
}



















