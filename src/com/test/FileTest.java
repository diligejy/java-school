package com.test;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) {
		File f = new File("C:\\MyTest");
		f.mkdir();

		f = new File("C:\\MyTest\\야구");
		f.mkdir();

		f = new File("C:\\MyTest\\배구");
		f.mkdir();

		f = new File("C:\\MyTest\\야구\\농구");
		f.mkdir();

		f = new File("C:\\MyTest\\배구\\a.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
