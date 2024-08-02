package main;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		
		// 텍스트파일과 연결된 입력스트림 생성
		FileInputStream fis = new FileInputStream("input.txt");
		
		System.out.println(fis.read()); // 65(A)
		System.out.println(fis.read()); // 66(B)
		System.out.println(fis.read()); // 67(C)
		System.out.println(fis.read()); // -1(null값)
		System.out.println();
		
		// fis 스트림은 사용이 끝나 새로운 fis2 스트림 생성
		FileInputStream fis2 = new FileInputStream("input.txt");
		
		System.out.println((char)fis2.read()); // 65
		System.out.println((char)fis2.read()); // 66
		System.out.println((char)fis2.read()); // 67
	}

}
