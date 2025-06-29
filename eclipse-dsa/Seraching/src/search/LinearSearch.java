package search;

import java.util.Scanner;

public class LinearSearch {

	public static int linearSearch(int[] arr, int n, int target) {

		for (int i = 0; i < n; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter array size: ");
		int n = scanner.nextInt();

		System.out.println("Enter array elements: ");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.println("Enter target: ");
		int target = scanner.nextInt();

		int num = linearSearch(arr, n, target);
		if (num > 0) {
			System.out.println("Index: " + num + "\nTaeget Element: " + arr[num]);
		} else
			System.out.println("Target element Not Found");
	}

}
