package main;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) throws IOException {
		
		// 1바이트 출력 스트림 생성
		FileOutputStream fos = new FileOutputStream("output2.txt");
		
		byte[] arr = {65,66,67};
		
		// 배열의 모든 데이터 출력(자바->txt)
		fos.write(arr, 1,2); // arr 배열의 index 1~2까지만 출력
		fos.flush(); // 출력 버퍼에 잔류하는 모든 바이트를 출력
		fos.close(); // 출력 스트림을 닫음
	}

}
