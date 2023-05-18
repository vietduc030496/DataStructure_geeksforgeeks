package com.vti.array.search;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class _3_MostFrequentElement {

	public static void main(String[] args) {
		int arr[] = {40,50,30,40,50,30,30};
		mostFrequent(arr);
	}
	
	public static void mostFrequent(int arr[]) {
		Map<Integer, Integer> occurrenceElement = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			occurrenceElement.put(arr[i], occurrenceElement.getOrDefault(arr[i], 0) + 1);
		}
		
		int max = 1;
		int value = 0;
		int number = 1;
		for (Entry<Integer, Integer> entry : occurrenceElement.entrySet()) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				value = entry.getKey();
				number = entry.getValue();
				
			}
		}
		System.out.println("Phan tu xuat hien nhieu nhat là: " + value + " xuat hien " + number + " lan");
	}

}
