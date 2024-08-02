package main;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex05 {

	public static void main(String[] args) throws IOException {
		
		// 입력 스트림 생성 
		FileInputStream fis = new FileInputStream("test.txt");

		// 10개 크기의 배열 생성
		byte[] arr = new byte[10];
		int size;

		while (true) {
			// 파일의 내용을 읽어서 배열에 저장하고, 읽어온 문자의 크기 변환
			size = fis.read(arr);
			if (size == -1) { // 파일 끝에 도달하면 종료
				break;
			}
			for (int i = 0; i < size; i++) {
				System.out.print((char) arr[i]);
			}
			System.out.println(": " + size + "바이트 읽음");
		}

	}

}
