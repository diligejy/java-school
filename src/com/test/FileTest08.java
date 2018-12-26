package com.test;

import java.io.*;

public class FileTest08 {
	public static void main(String[] args) throws IOException {
		// Stream (byte) read() write() = String X
		// char Read() = String X
		// 대상을 파일에서 읽어서 파일로 쓰곘다
		File f = new File("b.txt");
		FileInputStream fi = new FileInputStream(f);
		BufferedInputStream bi = new BufferedInputStream(fi);
		
		File res = new File("res.txt");
		FileOutputStream fo = new FileOutputStream(res);
		BufferedOutputStream bfo = new BufferedOutputStream(fo);
		int ch = 0;
		
		while((ch = bi.read()) != -1) {
			bfo.write(ch);
		}
		bfo.close();
		fo.close();
		bi.close();
		fi.close();
	}
}
