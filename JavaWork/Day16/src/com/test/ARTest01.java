package com.test;

public class ARTest01 {
	public static void Prn(int []r) {
		System.out.println(" = 출력 = ");
		for (int res : r) {
			System.out.printf("%5d", res);
		}
	}
	public static void PrnHap(int [] ar) {
		// ar [5] = ar [0] ~ ar [4] 합을 구한 후 전체 출력
		
		ar[ar.length-1] = 0 ;
		for(int i=0; i < ar.length-1; i++) {
			ar[ar.length-1] += ar[i]; 
					 
		}
		
		System.out.println("ar[5] = " +ar[5]);
	}
	
	
	public static void main(String[] args) {
		//
		int [] ar = {10, 20, 30, 40, 50, 0};
		PrnHap(ar);
		
	}
	
}
