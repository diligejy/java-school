package com.test;

public class ARTest05 {
	public static void main(String[] args) {
		int [] [] ar = new int [4][];
		ar[0] = new int [] {10, 20, 30, 40};
		ar[1] = new int [] {10, 20};
		ar[2] = new int [] {10, 20, 30};
		ar[3] = new int [] {10};
		System.out.println();
		ARTest04.Prn(ar);
		System.out.println();
		ARTest04.Prn02(ar);
		
	}
}
