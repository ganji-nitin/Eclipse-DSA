package programming;

public class NumberPatterns {

	public static void main(String[] args) {
		int num = 5;
//		pattern1(num);//3
//		pattern2(num);//3
//		pattern3(num);//3
//		pattern4(num);//5
//		pattern5(num);//5
		pattern6(num);//5
//		pattern7(num);
		
	}

	public static void pattern1(int num) {
		for (int i = 1; i < num; i++) {
			int n = i;
			int m = 1;
			for (int j = 1; j < num; j++) {
				if (i + j <= num) {
					System.out.print(n++ + " ");
				} else
					System.out.print(m++ + " ");
			}
			System.out.println();
		}
	}

	public static void pattern2(int num) {
		for (int i = 1; i <= num; i++) {
			int n = 1;
			int m = i - 1;
			for (int j = 1; j < 2 * num; j++) {
				if (i + j > num && j - i < num) {
					if (j <= num) {
						System.out.print(n++ + " ");
					} else
						System.out.print(m-- + " ");
				} else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void pattern3(int num) {
		for (int i = 1; i <= num; i++) {
			int n = i;
			int m = 1;
			for (int j = 1; j < 2 * num; j++) {
				if (i + j > num && j - i < num) {
					if (j < num) {
						System.out.print(n-- + " ");
					} else
						System.out.print(m++ + " ");
				} else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void pattern4(int num) {
		for (int i = 1; i <= num; i++) {
			int n = i;
			int m = 0;
			for (int j = 1; j <= num; j++) {
				if (j % 2 != 0) {
					System.out.print(n + " ");
					n = n + 2 * num;
				} else {
					m = j * num - i + 1;
					System.out.print(m + " ");
				}
			}
			System.out.println();
		}
	}
	
	public static void pattern5(int num) {
		for(int i = 1; i <= num; i++) {
			
			for(int j = i; j <= num; j++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i; j++) {
				System.out.print(i+" ");
			}
			
			System.out.println();
		}
	}
	
	public static void pattern6(int num) {
		
		for(int i = 1; i <= num; i++) {
			int n = 1;
			for(int j = 1; j <= i; j++) {
				System.out.print(n++ +" ");
			}
			System.out.println();
		}
	}
	
	public static void pattern7(int num) {
		
		for(int i = 1; i <= num; i++) {
			int n = 1;
			for(int j = 1; j <= j + i; j++) {
				System.out.print(n++ +" ");
			}
			System.out.println();
		}
	}
	
}
























