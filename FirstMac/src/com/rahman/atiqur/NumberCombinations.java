package com.rahman.atiqur;

public class NumberCombinations {
	public static int seq = 0;
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		
		printCombinations(arr, 0);
	}
	
	public static void printCombinations(int[] x, int start) {
		if(start == x.length) {
			printArr(x);
			return;
		}
		
		for(int i=start;i<x.length;i++) {
			int tmp = x[start];
			x[start] = x[i];
			x[i] = tmp;
			
			printCombinations(x, start+1);
			
			tmp = x[start];
			x[start] = x[i];
			x[i] = tmp;
			
		}
	}
	
	public static void printArr(int a[]) {
		
		//System.out.print(++seq+": ");
		for(int y : a)
			System.out.print (y+" ");
		System.out.println();
	}
}
