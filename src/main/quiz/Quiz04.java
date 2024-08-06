package main.quiz;

import java.io.FileOutputStream;
import java.io.IOException;

public class Quiz04 {

	public static void main(String[] args) throws IOException { // 예외처리

		FileOutputStream fos = new FileOutputStream("Quiz04.txt");
		
		// 초기값: 'A' == 65 (아스키 코드)
		for (int i = 65; i <= 90; i++) {
			fos.write(i);
		}

	}

}
