package cashe;

public class StarPattern1 {

	public static void main(String[] args) {
//		pattern1(5);
//		pattern2(5);
		pattern3(5);
	}
	
	
	//    *
	//   * *
	//  * * *
	// * * * *
	//* * * * *
	
	public static void pattern1(int num) {
		for(int i = 0; i < num; i++) {
			for(int j = i; j < num - 1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	//* * * * *
	// * * * *
	//  * * *
	//   * *
	//    *
	
	public static void pattern2(int num) {
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = num; j > i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	//    *
	//   * *
	//  * * *
	// * * * *
	//* * * * *
	// * * * *
	//  * * *
	//   * *
	//    *
	
	public static void pattern3(int num) {
		for(int i = 0; i < num; i++) {
			for(int j = i; j < num - 1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = 1; i < num; i++) {
			for(int j = 1; j < i + 1; j++) {
				System.out.print(" ");
			}
			for(int j = i; j < num; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
