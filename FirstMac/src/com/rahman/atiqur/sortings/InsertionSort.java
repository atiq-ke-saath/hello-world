package com.rahman.atiqur.sortings;

public class InsertionSort {
	public static void main(String[] args) {
		int[] a = {20,13,45,7,87,98,21,56,76,12,10,65,10,10,12,34};
		
		
		for(int i=1;i<a.length;i++) {
			int tmp = a[i];
			
			int j;
			for(j=i-1;j>=0 && a[j]>tmp;j--)
				a[j+1] = a[j];
			a[j+1] = tmp;
		}
		
		for(int y : a) 
			System.out.print (y+" ");
	}
}
