package com.test;

public class MTest06 {
	public static void main(String[] args) {
		System.out.println(com.test01.Mytest.a);
		// Math Class Method Execute
		// public static double sqrt(double a) -> 8바이트 이하는 다 온다잉 ㅋ 아이 조아 ㅋ 
		/*int su = 100;
		double d = Math.sqrt(su); // Mathsqrt(100.0);
		System.out.println();
		System.out.printf(" su = %d  => sqrt = %3.1f", su, d);
		*/
		
		// ex) "100"을 숫자로 변환한다음, +200을 해서 전송하고 싶다.
		String str = "100";
		int r = Integer.parseInt(str);
		r += 200; // r = 100+ 200 
		r -= 50;
		r *= 2;
		r /= 2;
		System.out.println(r);
		
		// int를 문자열로 변환하는 메소드
	
		String str02 = Integer.toString(r);
		System.out.println(str02+100);
		
		
		
		
	}
}
