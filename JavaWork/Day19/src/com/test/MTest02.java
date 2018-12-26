package com.test;

import java.util.*;
import com.test.Score;

public class MTest02 {
	public static void main(String[] args) {
		Vector <Score> vm = new Vector<>();
		vm.add(new Score("홍길동", 100, 100, 100));
		vm.add(new Score("정길동", 90, 90, 90));
		vm.add(new Score("이길동", 80, 80, 80));
		vm.add(new Score("최길동", 70, 70, 70));
		System.out.println("전체 출력");

/*		Prn(vm);*/
/*		System.out.println("1. 정길동의 이름을 박길동으로 바꾸어 전체출력");*//*
		Prn03(vm);
		Prn04(vm);
		Prn05(vm);
		Prn06(vm);*/
/*		System.out.println("2. 최길동의 국어점수를 100으로 변경 후 전체출력");
		System.out.println("3. 이길동이 있는 객체의 수학점수를 100으로 변경 후 출력");
		System.out.println("4. 이길동의 이름이 들어있는 객체의 인덱스를 구하자");*/
		vm.remove(0);
		Prn(vm);
		vm.set(1, new Score("재대입", 90, 80,70));
		Prn(vm);
		
	}

	public static void Prn(List<Score> v) {
		System.out.println(" Case 1 : for ");
		for (Score sm : v) {
			System.out.println(sm);
		}
	}

	public static void Prn01(List<Score> rm) {
		System.out.println("Case 2 :for ");
		for (int i = 0; i < rm.size(); i++) {
			System.out.println(rm.get(i));
		}
	}

	public static void Prn02(List<Score> rm) { // 중첩되어있는 경우 사용하면 좋음
		System.out.println("Case 3 : Iterator");
		Iterator<Score> res = rm.iterator();
		while (res.hasNext()) {

			System.out.println(res.next());

		}

	}

	public static void Prn03(Vector<Score> rm) {
		// 정길동의 이름을 박길동으로 바꾸어 전체출력
		System.out.println("1. 정길동의 이름을 박길동으로 바꾸어 전체출력");
		for (int i = 0; i < rm.size(); i++) {
			if (rm.get(i).getName().trim().equals("정길동")) {
				rm.get(i).setName("박길동");
				
			}
			System.out.println(rm.get(i));
		}

	}
	public static void Prn04(Vector<Score> rm) {
		// 최길동의 국어점수를 100으로 변경 후 전체출력
		for (int i = 0; i < rm.size(); i++) {
			if (rm.get(i).getName().trim().equals("최길동")) {
				rm.get(i).setKor(100);
			}
			
			System.out.println(rm.get(i));
		}

	}
	
	public static void Prn05(Vector<Score> rm) {
		// 이길동이 있는 객체의 수학점수를 100으로 변경 후 출력
		for (int i = 0; i < rm.size(); i++) {
			if (rm.getName().trim().equals("정길동")) {
				rm.setName("박길동");
			}
			System.out.println(rm.get(i));
		}

	}
	
	public static void Prn06(Vector<Score> rm) {
		// 이길동의 이름이 들어있는 객체의 인덱스를 구하자
		for (int i = 0; i < rm.size(); i++) {
			if (rm.getName().trim().equals("정길동")) {
				rm.setName("박길동");
			}
			System.out.println(rm.get(i));
		}

	}
}