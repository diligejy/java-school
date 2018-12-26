package com.test01;

import com.test.ARTest01;

public class MTest {
	public static void main(String[] args) {
		//public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
		int [] ar = {10, 20, 30, 40, 50};
		int [] br = {3000, 4000, 5000};
		int [] ar_copy = new int [5];
		
		int [] [] k = {{11, 22, 33}, {44, 55, 66}};
		
		System.out.println("   ar   ");
		ARTest01.Prn(ar);
		System.out.println();
		System.out.println();
		
		System.out.println("   ar_copy   ");
/*		System.arraycopy(ar, 0, ar_copy, 0, 2);*/
/*		System.arraycopy(br, 0, ar_copy, 2, br.length);*/		
		System.arraycopy(k[0], 1, ar_copy, 0, 2);
		System.arraycopy(k[1], 0, ar_copy, 2, 3);
		ARTest01.Prn(ar_copy);	
	}
}
