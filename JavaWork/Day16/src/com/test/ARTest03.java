package com.test;

public class ARTest03 {
	
	// ���ڿ��� �Է¹��� View_Prn�� �̿��Ͽ� �ҹ��� ���� �빮�� ������ ����Ѵ�.
	public static void View_Prn(String str) {
		
		/*�������� ���� ����
		 * 
		 */
		char [] ch = str.toCharArray();
		int L_cnt = 0;
		int U_cnt = 0;
		for (char r : ch) {
			if(Character.isUpperCase(r)) {
				U_cnt++;
			}
			if(Character.isLowerCase(r)) { // else�� ���� �ʴ°� ����Ʈ ! else���� ���� ��
				L_cnt++;
			}
		}
		
		System.out.println("�빮�� : " + U_cnt + " �ҹ��� : " + L_cnt);
		
	}

	public static void main(String[] args) {
		String str = "Converts this string to a new character array.\r\n";
		View_Prn(str);
		
		//str�� ��ü ���ڸ� Ž���Ͽ��� �Ѵ�.
		// 1. char[]�� ������ �ؼ� char�� ���ڸ� �� ���ھ� Ž���� �� �־�� �Ѵ�.
		// 2. �ҹ����� ��� �빮���� ��� ������ ���ϴ� cnt ������ �����ؼ� ī��Ʈ �Ѵ�.
		
	}
}
