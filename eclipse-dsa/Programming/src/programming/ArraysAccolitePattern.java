package programming;

import java.util.Arrays;

public class ArraysAccolitePattern {

	public static void main(String[] args) {
		int [] a = {4, 2, 5, 1};
		int [] b = {8, 0, 3, 5};
		int n = 3;
		
		int[] c = arrays1(a, b, n);
		
		for(int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
		}
		
		System.out.println();
		
		int[] d = arrays2(a, b, n);
		
		for(int i = 0; i < d.length; i++) {
			System.out.print(d[i]+" ");
		}
	}
	
	public static int[] arrays1(int [] a, int [] b, int n) {
		Arrays.sort(a);
		Arrays.sort(b);
		
		int [] c = new int[n];
		
		for(int i = 0; i < n; i++) {
			c[i] = a[i] + b[0];
		}
		return c;
	}
	
	public static int[] arrays2(int [] a, int [] b, int n) {
		int [] c = new int[n];
		
		for(int i = 0; i < a.length - 1; i++) {
			if(a[i] > a[i + 1]) {
				int temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
			}
		}
		
		for(int i = 0; i < b.length - 1; i++) {
			if(b[i] > b[i + 1]) {
				int temp = b[i];
				b[i] = b[i + 1];
				b[i + 1] = temp;
			}
		}
		
		for(int i = 0; i < n; i++) {
			c[i]=a[i]+b[0];
		}
		
		return c;
		
	}
}









