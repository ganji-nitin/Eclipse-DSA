package programming;

public class PascalsTriangle {

	public static void main(String[] args) {
		pascalsTriangle(5);
//		pattern4(5);
	}
	
	public static void pascalsTriangle(int num) {
		
		for(int i = 0; i < num; i++) {
			for(int j = i; j < num - 1; j++) {
				System.out.print(" ");
			}
			
			int n = 1;
			for(int j = 0; j <= i; j++) {
				System.out.print(n+" ");
				
				n = n * (i - j) / (j + 1);
			}
			System.out.println();
		} 
	}
	
//	 // Function to print Pascal's Triangle
//    public static void printPascalsTriangle(int rows) {
//        // Outer loop to handle the number of rows
//        for (int i = 0; i < rows; i++) {
//            // Print leading spaces for alignment
//            for (int j = 0; j < rows - i - 1; j++) {
//                System.out.print(" ");
//            }
//            
//            // Print the elements of each row
//            int num = 1;  // The first number in a row is always 1
//            for (int j = 0; j <= i; j++) {
//                System.out.print(num + " ");
//                // Calculate the next number using the binomial coefficient
//                num = num * (i - j) / (j + 1);
//            }
//            
//            // Move to the next line after each row
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        int rows = 5;  // You can change this number to print more rows
//        printPascalsTriangle(rows);
//    }
	
	// 1 10 11 20 21
	// 2  9 12 19 22
	// 3  8 13 18 23
	// 4  7 14 17 24
	// 5  6 15 16 25
	
	public static void pattern4(int num) {
		
		for(int i = 1; i <= num; i++) {
			
			int n = i;
			int m = 0;
			
			for(int j = 1; j <= num; j++) {
				if(j % 2 != 0) {
					System.out.print(n + " ");
					n = n + 2 * num;
				}
				else {
					m = j * num - i + 1;
					System.out.print(m + " ");
				}
			}
			System.out.println();

		}
	}
}
