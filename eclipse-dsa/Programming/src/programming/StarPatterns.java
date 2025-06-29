package programming;

public class StarPatterns {
	
	public static void main(String[] args) {
//		pattern1(5);
//		pattern2(5);
//		pattern3(5);
		pattern4(5);
//		pattern5(5);
	}

	
	public static void pattern1(int num) {
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	
	public static void pattern2(int num) {
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	
	public static void pattern3(int num) {
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = i; j <= num; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	
	public static void pattern4(int num) {
		for(int i = 1; i <= num; i++) {
			for(int j = num; j > i; j--) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i; j++ ) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	
	static public void pattern5(int num) {
		for(int i = 1; i <= num; i++) {
			for(int j = num; j > i; j--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
				
			}
		for(int i = 1; i <= num-1; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for(int j = i; j <= num-1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}













