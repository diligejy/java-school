package com.test02;

import java.io.*;

public class FileTest04 {
	public static void main(String[] args) throws Exception {
		LineNumberReader r = new LineNumberReader(new FileReader("b.txt"));
		
		int ch = 0;
		//r.setLineNumber(100);
		//System.out.print(r.getLineNumber());
		r.setLineNumber(0);
		while ((ch = r.read()) != -1) {
			if ((char) ch == '\n') {
				System.out.printf("%5d \n", r.getLineNumber());
			} 
		}
		r.close();
	}
}
