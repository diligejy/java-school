package com.test;

public class ARTest04 {
	public static void main(String[] args) {
		int[] ar[] = new int[][] { { 10, 20, 30 }, { 40, 50, 60 } };
		/*
		 * System.out.println(ar[0].length); System.out.println(ar[1].length);
		 * 
		 * System.out.println(ar[0][0]); //10 System.out.println(ar[0][1]); //20
		 * System.out.println(ar[0][2]); //30
		 * 
		 * System.out.println(ar[1][0]); //40 System.out.println(ar[1][1]); //50
		 * System.out.println(ar[1][2]); //60
		 */

		Prn02(ar);
	}

	public static void Prn(int[][] res) {
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				System.out.printf("%5d", res[i][j]);
			}
			System.out.println();
		}
	}

	public static void Prn02(int[][] res) {
		for (int[] h : res) {
			for (int v : h) {
				System.out.printf("%5d", v);
			}
			System.out.println();
		}
	}
}
