package com.test01;

public class MyTest {
	public static void main(String[] args) {
		int su = -1;
		if (su < 0) {
			try {
				throw new MyException("   양수만 입력   ");
				
			} catch (MyException e) { // MyException e = new MyException();
				System.out.println(e);  //toString이 있는데 그걸 Override해서 바꿔주었음 
				System.out.println(e.getMessage()); 

			} catch (Exception ei) {
				System.out.println("Exception e : " + ei);
			} // catch
		} // if
	}// main
}// MyTest
