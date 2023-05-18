package com.vti.array.search;

import java.util.HashSet;
import java.util.Set;

public class _7_FindCommonElementsInThreeSortedArrays {

	public static void main(String[] args) {
		int ar1[] = { 1, 5, 10, 20, 40, 80 };
	    int ar2[] = { 6, 7, 20, 80, 100 };
	    int ar3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };
	    findCommon(ar1, ar2, ar3);
	}
	
	public static void findCommon(int a[], int b[], int c[]) {
		 Set<Integer> aSet = new HashSet<>();
		 Set<Integer> bSet = new HashSet<>();
		 Set<Integer> cSet = new HashSet<>();
		 
		 for (int x : a) {
			 aSet.add(x);
		 }
		 
		 for (int y : b) {
			bSet.add(y);
		}
		 
		for (int z : c) {
			if (aSet.contains(z) && bSet.contains(z)) {
				if (!cSet.contains(z)) {
					System.out.println(z);
				}
				cSet.add(z);
			}
		}
	}

}
