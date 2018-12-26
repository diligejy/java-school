package com.test;

import java.io.*;
// Stream단위로  byte read, write 

public class FileTest07 {

	public static void main(String[] args) {
		File fi = new File("b.txt");
		try {
			My_Write(fi);
			My_Read(fi);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void My_Write(File fi) throws IOException {
		FileOutputStream fos = new FileOutputStream(fi); //throws FileOutputStream
		for(int i = 65; i <= 90; i++) {
			fos.write(i); // throws IOException
		}
		fos.close();
	}

	public static void My_Read(File fi) {

	}
}
