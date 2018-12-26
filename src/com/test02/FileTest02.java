package com.test02;

import java.io.*;
// Stream단위로  byte read, write 

public class FileTest02 {

	public static void main(String[] args) {
		File fi = new File("b.txt");
		try {
			My_Write(fi);
			My_Read(fi);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void My_Write02(File fi) {
		try (FileOutputStream fos = new FileOutputStream(fi)) {
			for (int i = 65; i <= 90; i++) {
				try {
					fos.write(i);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public static void My_Write(File fi) throws IOException {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(fi);
			for (int i = 65; i <= 90; i++) {
				fos.write(i); // throws IOException
			}

		} catch (

		FileNotFoundException f) {

		} catch (IOException i) {

		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void My_Read(File fi) throws IOException {
		FileInputStream fr = new FileInputStream(fi);
		// 한글자씩 읽어서 리턴하자 글자 없으면 -1을 리턴한다

		int ch = 0;

		// 한글자씩 -1이 아닐때까지 읽어서 리턴하자

		while ((ch = fr.read()) != -1) {
			System.out.println((char) ch);
		}
		fr.close();
	}
}
