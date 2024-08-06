package main;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Ex09 {

	public static <E> void main(String[] args) throws IOException {

		// 문자 기반 출력 스트림 생성
		// 해당 파일이 있으면 연결, 없으면 자동 생성
		FileWriter fw = new FileWriter("writer.txt");
		FileOutputStream fw2 = new FileOutputStream("writer2.txt");
		
		// 문자 하나 출력
		fw.write('A');
		
		// 문자열 출력
		fw.write("안녕하세요",1,3);
		
		// 특수기호 출력
		fw.write('\n');
		
		// 배열 출력
		char[] arr = {'a','b','c'};
		fw.write(arr,1,2);
		
		
		
		// Filewriter는 버퍼을 사용하여, 데이터를 모았다가 한번에 출력함
		// 버퍼: 데이털르 임시로 저장하는 공간
		fw.flush();
		fw.close();
	}

}
