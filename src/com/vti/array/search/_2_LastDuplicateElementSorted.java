package com.vti.array.search;

public class _2_LastDuplicateElementSorted {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 5, 6, 6, 7, 7 };
		
		for (int i = arr.length - 1; i >= 1; --i) {
			if (arr[i] == arr[i - 1]) {
				System.out.println("ket qua la: " + arr[i] + " o vi tri thu " + i );
				return;
			}
		}
		
		System.out.println("khong tim thay so nao trung nhau");
	}

}
