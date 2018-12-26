package com.exam02;
import java.util.Date;

public class MyTest02 {

	public static String getName() {
		return "ȫ�浿";
	}
	public static void Prn() {
		System.out.println("abcde ");
		
	}
	public static void main(String[] args) {
		
		Date   today = new Date();
		today.setMonth(11);
		System.out.println(today.getMonth()+1);
		System.out.println(getName());
		System.out.println();
		
		
	}

}
