package search;

import java.util.Scanner;

public class BinarySearch {

	public static int binarySearch(int[] arr, int n, int target) {

		int low = 0; int high = n-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(target == arr[mid]) {
				return mid;
			}
			else if(target < arr[mid]) {
				high = mid - 1;
			}
			else
				low = mid + 1;
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

		int num = binarySearch(arr, n, target);
		if (num > 0) {
			System.out.println("Index: " + num + "\nTaeget Element: " + arr[num]);
		} else
			System.out.println("Target element Not Found");
	}

}
