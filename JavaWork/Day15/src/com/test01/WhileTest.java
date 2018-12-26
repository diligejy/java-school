package com.test01;

public class WhileTest {
	public static void main(String[] args) {
		int i = 1;
		
		while(i <= 5) {
			int j = 1;
			System.out.println(i);
			while(j <= 5) {
				System.out.println("\t"+j);
				j++;
			}
			i++;	
		}
	}
}
