package com.test01;
//ex) int a ; double d; => U_Test ������ DataType


class U_Test{
	
	public int a;
	public double d;
	
}

public class MyTest01 {
	public static void main(String[] args) {
		
		// non-static�� �ּҸ� ����! ���鷯 �����!
		// class��  Ŭ��������  
		   U_Test   um    = new U_Test();
	    // heap = new�����ڸ� ������ �������� �޸� �Ҵ� �� ������ ������ �ڵ������� �Ҹ�Ǵ� ����
		   System.out.println(um);
		   
		   um.a = 100;
		   um.d = 97.9;
		   System.out.println(um.a);
		   System.out.println(um.d);
		   um=null;
		   System.out.println(um);
		   
	}
	
	
}
