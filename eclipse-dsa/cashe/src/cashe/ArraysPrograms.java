package cashe;

import java.util.ArrayList;

public class ArraysPrograms {

	public static void main(String[] args) {
//		arrays1();
//		array2();
		System.out.println(array3());
	}

	public static void arrays1() {
		int[] arr = { 11, 222, 33, 444, 5555, 6, 7777 };
		ArrayList<Integer> list = new ArrayList<>();

        for (int j : arr) {
            int num = j;
            int count = 0;
            while (num != 0) {
                count++;
                num = num / 10;
            }
            if (count < 3) {
                list.add(j);
            }
        }

		System.out.println(list);
	}

	public static void array2() {
		int[] arr = { 5, 4, 1, 3, 2 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
        for (int j : arr) {
            System.out.println(j);
        }
	}
	
	public static Integer array3() {
		Integer[] arr = {1,9,5,6,3,2};
		int maxNumber = Integer.MIN_VALUE;
		for(Integer i : arr) {
			if(i > maxNumber) {
				maxNumber = i;
			}
		}
		return maxNumber;
	}
}
