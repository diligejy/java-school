package com.test02;

import java.io.*;

public class FileTest {
	public static void main(String[] args) throws IOException {
		//char를 읽고 쓰자. 단, 버퍼링을 하자.
		//File, FileReader, BufferReader => ReadLine();ㄷㄷ
		FileReader fr = new FileReader("b.txt");
		
		BufferedReader br = new BufferedReader(fr);
		String str = null;
		while((str = br.readLine()) != null) {
			System.out.println(str);
		}
		br.close();
		fr.close();
	}
}
