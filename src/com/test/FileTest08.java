package com.test;

import java.io.*;

public class FileTest08 {
	public static void main(String[] args) throws IOException {
		// Stream (byte) read() write() = String X
		// char Read() = String X
		// 대상을 파일에서 읽어서 파일로 쓰곘다
		File f = new File("parkboyoung.jpg");
		FileInputStream fi = new FileInputStream(f);
		BufferedInputStream bi = new BufferedInputStream(fi);
		
		File res = new File("pby.jpg");
		FileOutputStream fo = new FileOutputStream(res);
		BufferedOutputStream bfo = new BufferedOutputStream(fo);
		int ch = 0;
		
		while((ch = bi.read()) != -1) {
			bfo.write(ch);//BufferedInputStream(byte단위)- 이미지, 음성, 동영상  etc Streaming 가능 한 것들 vs BufferedReader(char단위)- 문자 관리
			
		}
		bfo.close();
		fo.close();
		bi.close();
		fi.close();
	}
}
