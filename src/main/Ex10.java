package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10 {

	public static void main(String[] args) throws IOException {

		// 바이트 기반 스트림 생성(먼저)
		FileInputStream fis = new FileInputStream("reder.txt");

		while (true) {
			int i = fis.read();
			if (i == -1) {
				break;
			}
			System.out.print((char) i); // 1바이트씩 가져오기 때문에 한글이 깨짐
		}
		System.out.println();
		System.out.println("-----------------------------------------");
		
		// 바이트 기반 스트림 생성
		FileInputStream fis2 = new FileInputStream("reder.txt");

		// 보조 스트림 생성
		InputStreamReader isr2 = new InputStreamReader(fis2);

		while (true) {
			int i = isr2.read();
			if (i == -1) {
				break;
			}
			System.out.print((char) i);
		}
	}

}
