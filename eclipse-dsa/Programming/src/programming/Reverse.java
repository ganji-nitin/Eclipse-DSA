package programming;

public class Reverse {

	public static int reverse(int num) {
		int rev = 0;
		while(num!=0) {
			int rem = num%10;
			rev = rev*10+rem;
			num=num/10;
		}
		return rev;
	}
	
	public static boolean palindrome(int num) {
		int rev = 0;
		int temp = num;
		while(num!=0) {
			int rem = num%10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		return temp == rev;
	}
	
	public static int binary(int num) {
		int bin = 0;
		int i = 1;
		while(num!=0) {
			int rem = num % 2;
			bin = bin + i * rem;
			i = i * 10;
			num = num/2;
		}
		return bin;
	}
	
	public static int decimal(int num) {
		int dec = 0;
		int i = 1;
		while(num!=0) {
			int rem = num%10;
			dec = dec + i * rem;
			i = i*2;
			num = num/10;
		}
		return dec;
	}
	
	public static void main(String[] args) {
		
//		int num = 123;
//		System.out.println(reverse(num));
		
//		int num = 14588541;
//		if(palindrome(num)) {
//			System.out.println(num + " is a palimdrome");
//		}
//		else
//			System.out.println(num+" is not a palimdrome");
		
//		System.out.println(binary(9));
		
		System.out.println(decimal(1001));
	}
}
