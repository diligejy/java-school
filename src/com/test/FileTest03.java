package com.test;

import java.io.*;

public class FileTest03 {
	public static void main(String[] args) {
		// 1.MyTest\\배구\\a.txt를 MyTest02\\AA 디렉토리 밑으로 이동
		// 2. MyTest\\배구 삭제
		// 3. MyTest\\야구\\농구 -> 축구로 이름 변경


		File f = new File("C:\\MyTest\\배구\\a.txt");
		f.renameTo(new File("C:\\MyTest02\\AA\\a.txt")); // 1번

		File f1 = new File("C:\\MyTest\\배구"); // 2번 f1.delete();
		f1.delete();

		File f2 = new File("C:\\MyTest\\야구\\농구"); // 3번 f1.renameTo(f2)
		f2.renameTo(new File("C:\\MyTest\\야구\\축구"));
	}
}
