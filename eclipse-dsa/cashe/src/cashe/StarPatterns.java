package cashe;

public class StarPatterns {

	public static void main(String[] args) {
//		pyramidPattern(5);
//		reversePyramidPattern(5);
		diamondPattern(5);
	}
	
	//    *
	//   * *
	//  * * *
	// * * * *
	//* * * * *
	
	public static void pyramidPattern(int num) {
		for(int i = 1; i <= num; i++) {
			for(int j = num; j > i; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
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
	
	public static void reversePyramidPattern(int num) {
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = i; k <= num; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	//     *
	//    * *
	//   * * *
	//  * * * *
	// * * * * *
	//  * * * *
	//   * * *
	//    * *
	//     *
	
	public static void diamondPattern(int num) {
		for(int i = 1; i <= num; i++) {
			for(int j = i; j < num; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
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
