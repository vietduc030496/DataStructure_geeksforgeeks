package com.vti.array.search;

public class _1_FindMaxAndMinElement {

	public static void main(String[] args) {

		int arr[] = { 12, 1234, 45, 67, 1 };

		int max = arr[0];
		int min = arr[0];
		
		for (int x : arr) {
			max = Math.max(max, x);
			min = Math.min(min, x);
		}
		System.out.println("so lon nhat: " + max);
		System.out.println("so nho nhat: " + min);
	}

}
