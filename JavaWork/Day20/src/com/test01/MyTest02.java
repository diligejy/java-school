package com.test01;

import java.util.TreeSet;
import java.util.*;

public class MyTest02 {
	public static void main(String[] args) {
		TreeSet<My> ts = new TreeSet<>();
		ts.add(new My());
		ts.add(new My("333", 10));
		ts.add(new My("222", 5));
		System.out.println(ts);

	}
}
