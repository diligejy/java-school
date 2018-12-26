package com.test;

import java.io.*;

public class FileTest06 {
	public static void main(String[] args) throws IOException {
		
		//파일 입출력 
		File fi = new File("a.txt"); //현재 디렉토리(File(String Pathname)생성자)
		FileWriter fw = new FileWriter(fi);
		fw.write("abcdefg \n");
		fw.write("abcdefg \n");
		fw.close();
		
		FileReader fr = new FileReader(fi);
		int ch;
		while( (ch = fr.read()) != -1){
			System.out.println((char)ch);
		}
	}
}
