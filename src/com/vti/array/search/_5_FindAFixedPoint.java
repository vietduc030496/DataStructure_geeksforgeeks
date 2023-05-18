package com.vti.array.search;

public class _5_FindAFixedPoint {

	public static void main(String[] args) {
		int arr[] = {-10, -5, 0, 3, 7};
		binarySearch(arr);
	}

	public static void binarySearch(int[] arr) {
		int left = 0;
		int right = arr.length - 1;

		int mid = 0;
		while (left < right) {
			mid = (left + right) / 2;
			if (arr[mid] == mid) {
				System.out.println("Fixed Point is " + mid);
				return;
			}
			if (arr[mid] > mid) {
				right = mid;
			} else {
				left = mid;
			}
		}
		System.out.println("ko tim thay");
	}

}
