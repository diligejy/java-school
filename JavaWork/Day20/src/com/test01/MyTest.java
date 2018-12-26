package com.test01;

import java.util.Arrays;

public class MyTest  {
	public static void main(String[] args) {
		My[] m = { new My("ddd", 60), new My("aaa", 70), new My("ccc", 30), new My("bbb", 50)};
		System.out.println();
		Prn(m);
		Arrays.sort(m);
		Prn(m);
		
	}
	public static void Prn(My[] r) {
		for(My res :  r) {
			System.out.println(res);
		}//for
		System.out.println("==================================");
	}
}
