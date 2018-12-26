package com.test;

import java.util.Arrays;

public class EmpTest {

	public static void main(String[] args) {

		Emp e1 = new Emp("홍길동", "aaa111");
		Emp e2 = new Emp("정길동", 222);
		System.out.println(e1);
		System.out.println(e2);

		Emp e3 = new Emp("박길동", 90.9);
		System.out.println(e3.getEmp_no());

		System.out.println(Character.compare('b', 'B'));

		Character c1 = new Character('c');
		Character c2 = new Character('C');

		System.out.println(c1.compareTo(c2));

		System.out.println("abcde".compareTo("abcde"));// A = 65, a=97, 1 =

		String[] str = { "a1111", "c1111", "b1111", "f1111" };
		System.out.println(str);

		Prn(str);
		
		Arrays.sort(str);
		Prn(str);
	}

	public static void Prn(String[] r) {
		for (String s : r) {
			System.out.printf("%10s", s);
		}
		System.out.println();
	}
}
