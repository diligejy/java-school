package com.test;

import java.util.*;

public class MTest01 {
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<>();
		for(int i=0; i<11; i++) {
			v1.add(i);
		}
		v1.add(100);
		System.out.println(v1);
		System.out.println("���� : " + v1.size());
		System.out.println("�뷮 : " + v1.capacity());
	}
}
