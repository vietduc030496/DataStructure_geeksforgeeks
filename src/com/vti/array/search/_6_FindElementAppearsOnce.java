package com.vti.array.search;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class _6_FindElementAppearsOnce {

	public static void main(String[] args) {
		int[] a = {2, 3, 5, 4, 5, 3, 4};
		singleNumber(a);
	}
	
	public static void singleNumber(int[] arr) {
		Map<Integer, Integer> appearElement = new HashMap<>();
		
		for (int x : arr) {
			appearElement.put(x, appearElement.getOrDefault(x, 0) + 1);
		}
		
		for (Entry<Integer, Integer> entry : appearElement.entrySet()) {
			if  (entry.getValue() == 1) {
				System.out.println("Phan tu xuat hien 1 lan la " + entry.getKey());
				break;
			}
		}
	}

}
