package com.test;

public class ARTest02 {
	public static char[] getChar_r (String str) {
		
		//������ ������ ���ڿ��� char[]�� ��������.
		//char [] r = str.replace(" ", "").toCharArray();
		
		char [] r = str.replace(" ", "").toUpperCase().toCharArray();
		
		/*String s = str.replace(" ", "");
		char [] r = s.toCharArray();*/
		return r;
	}
	
	public static void main(String[] args) {
		
		//�־��� ���ڿ��� char[]�� ����� ����. 
		// �� �־��� �޼ҵ带 Ȱ���ؼ� ������ �Ѵ�
		// 1. ������ ������ ���� ���Ϲ޴´�.
		// 2. ������ ������ ���� �빮�ڷ� ���Ϲ���. 
		
		String str = "Converts this string to a new character array.\r\n";
		char [] res = getChar_r(str);
		for (char ch : res) {
			System.out.printf("%c,", ch);
		}
		/*System.out.println("ab c".replace(" ", ""));*/
		
	}
}
