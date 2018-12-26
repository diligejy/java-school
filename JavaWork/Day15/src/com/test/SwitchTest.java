package com.test;
import com.test.Score;
import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		System.out.println("입력하세요");
		
		Scanner avg = new Scanner(System.in);
		avg.nextLine();
		System.out.println(avg);
		
		switch((int)avg/10) {
		case 10:
		case 9 : System.out.println("A"); break;
		case 8 : System.out.println("B"); break;
		case 7 : System.out.println("C"); break;
		case 6 : System.out.println("D"); break;
		default : System.out.println("F"); break;
		}
		
		Score s1 = new Score();
		System.out.println(s1);
	}
}
