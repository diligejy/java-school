package com.test;

import java.util.*;

public class MTest {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("111");
		v.add("222");
		v.add("333");
		v.add(null);
		v.add(null);
		System.out.println(v);
		System.out.println(v.get(1));
		v.remove(2);
		System.out.println(v);
		v.set(0, "abc");
		System.out.println(v);
		System.out.println("���� : " + v.size());
		System.out.println("�뷮 : " + v.capacity());
		
	}

}
