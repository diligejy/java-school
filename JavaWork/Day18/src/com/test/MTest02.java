package com.test;

public class MTest02 {
	public static void main(String[] args) throws InterruptedException  {

		
			for(int i = 0; i < 50; i++) {
				Thread.sleep(500); //sleep은 throws를 가지고 있음//
  
 
				System.out.printf("%3c", '♥');//왜 하트를 String으로 하면 안되는걸까?
			}
	}
}
