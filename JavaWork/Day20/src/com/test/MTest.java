package com.test;

public class MTest {
	public static void main(String[] args) {
		String str = "abcd";
		String str02 = str.toUpperCase(); //CRUD가 되지 않음, 자기 자신은 변하지 않고 리턴 안함
		System.out.println(str);
		System.out.println(str02);
		
		StringBuilder sb = new StringBuilder();
		sb.append("abc");
		sb.append("def");
		System.out.println(sb);
		sb.insert(1, "1111");
		System.out.println(sb);
		
		System.out.println(sb + "," + sb.length() + "," + sb.capacity());//문자열을 준게 아니라서 capacity 16개
		
		System.out.println(sb.toString());
		
		String str03 = new String(sb);
		System.out.println(str03.toUpperCase());
		System.out.println(str03);
		System.out.println(sb);
	}
}
