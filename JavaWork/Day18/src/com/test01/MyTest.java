package com.test01;

public class MyTest {
	public static void main(String[] args) {
		int su = -1;
		if (su < 0) {
			try {
				throw new MyException("   ����� �Է�   ");
				
			} catch (MyException e) { // MyException e = new MyException();
				System.out.println(e);  //toString�� �ִµ� �װ� Override�ؼ� �ٲ��־��� 
				System.out.println(e.getMessage()); 

			} catch (Exception ei) {
				System.out.println("Exception e : " + ei);
			} // catch
		} // if
	}// main
}// MyTest
