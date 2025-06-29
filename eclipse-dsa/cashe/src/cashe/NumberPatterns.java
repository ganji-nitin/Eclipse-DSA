package cashe;

public class NumberPatterns {

	public static void main(String[] args) {
//		pascalsTriangle(5);
//		pattern1(5);
//		pattern2(5);
//		pattern3(5);
		pattern4(5);
//		System.out.println(armstrong(153));
//		System.out.println(armstrong1(407));
	}

	public static void pascalsTriangle(int num) {
		for (int i = 0; i < num; i++) {
			for (int j = i; j < num - 1; j++) {
				System.out.print(" ");
			}
			int n = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(n + " ");

				n = n * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}

	// 1 10 11 20 21
	// 2 9 12 19 22
	// 3 8 13 18 23
	// 4 7 14 17 24
	// 5 6 15 16 25
	public static void pattern1(int num) {
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

	//     1
	//    2 2
	//   3 3 3
	//  4 4 4 4
	// 5 5 5 5 5

	public static void pattern2(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = i; j <= num; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	// 1
	// 1 2
	// 1 2 3
	// 1 2 3 4
	// 1 2 3 4 5

	public static void pattern3(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static boolean armstrong(int num) {
		int copy = num;
		int sum = 0;
		int count = 0;
		while (num != 0) {
			num = num / 10;
			count++;
		}
		
		num = copy;
		
		while (num != 0) {
			int n = 1;
			int rem = num % 10;
			for (int i = 1; i <= count; i++) {
				n = n * rem;
			}
			sum = sum + n;
			num = num / 10;
		}

		return copy == sum;
	}
	
	public static boolean armstrong1(int num) {
		int copy = num;
		int sum = 0;
		int count = 0;
		
		while(num != 0) {
			count++;
			num = num / 10;
		}
		
		num = copy;
		
		while(num != 0) {
			int n= 1;
			int rem = num % 10;
			for(int i = 1; i <= count; i++) {
				n = n * rem;
			}
			
			sum = sum + n;
			num = num / 10;
		}
		
		return copy == sum;
	}
	
	public static void pattern4(int num) {
		for(int i = 1; i <= num; i++) {
			for(int j = i; j <= num; j++) {
				System.out.print(j+" ");
			}
			for(int j = 1; j < i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
