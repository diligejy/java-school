package com.test;

import java.io.*;

public class FileTest06 {
	public static void main(String[] args) throws IOException {

		// 파일 입출력
		File fi = new File("a.txt"); // 현재 디렉토리(File(String Pathname)생성자)
		try (FileWriter fw = new FileWriter(fi)) {
			fw.write("abcdefg \n");
			fw.write("abcdefg \n");
			fw.write("abcdefg \n")
		} catch (Exception e) {
			
		}

		try(FileReader fr = new FileReader(fi)){ // return을 int로 하기 때문에 -1과 비교하기 위해서 ch를 int형으로 선언
			int ch;
			while ((ch = fr.read()) != -1) {
				System.out.println((char) ch); // int형이므로 char로 형변환
			}
		
		}
	}
}
