package com.test;

public class MTest06 {
	public static void main(String[] args) {
		System.out.println(com.test01.Mytest.a);
		// Math Class Method Execute
		// public static double sqrt(double a) -> 8����Ʈ ���ϴ� �� �´��� �� ���� ���� �� 
		/*int su = 100;
		double d = Math.sqrt(su); // Mathsqrt(100.0);
		System.out.println();
		System.out.printf(" su = %d  => sqrt = %3.1f", su, d);
		*/
		
		// ex) "100"�� ���ڷ� ��ȯ�Ѵ���, +200�� �ؼ� �����ϰ� �ʹ�.
		String str = "100";
		int r = Integer.parseInt(str);
		r += 200; // r = 100+ 200 
		r -= 50;
		r *= 2;
		r /= 2;
		System.out.println(r);
		
		// int�� ���ڿ��� ��ȯ�ϴ� �޼ҵ�
	
		String str02 = Integer.toString(r);
		System.out.println(str02+100);
		
		
		
		
	}
}
