package com.test02;


//static, class : ����� ���ÿ� �ּҰ� �����ȴ�. ������ ! 
//Math.PI   java.awt.Color => Color.BLUE : Field (Static final)

public class MTest04 {
	//����    ����(����� ���ÿ� �ּ� ����) 
	public static void Prn_All(String a, String b) {
		System.out.println(a + "��" + b +"�� �ٹ��մϴ�");
		}
	
	public static void main(String[] args) {
		String name = "ȫ�浿";
		String addr = "����� ���ʱ� ���ھ�..";
		
		Prn_All(name, addr);
	}

}
