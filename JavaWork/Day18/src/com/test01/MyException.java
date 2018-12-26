package com.test01;

public class MyException extends Exception {
	public MyException(String message) {
		super(message);
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "야 음수잖아 다시 입력해 !!";
	}

}
