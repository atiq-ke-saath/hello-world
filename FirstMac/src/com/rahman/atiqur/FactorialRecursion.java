package com.rahman.atiqur;

public class FactorialRecursion {

	public static void main(String[] args) {
		System.out.println(factNonTail(15));
		System.out.println(factTail(15, 1));
	}
	
	static int factNonTail(int x) {
		return x < 2 ? 1 : x * factNonTail(x-1);
	}
	
	static int factTail (int x, int aux) {
		
		return x == 1 ? aux : factTail(x-1, x*aux);
	}
}
