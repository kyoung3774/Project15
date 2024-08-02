package main;

import java.io.File;
import java.io.IOException;

public class Ex13 {

	public static void main(String[] args) throws IOException {

		// File: 파일 정보를 담는 클래스(활용도가 제일 높음)
		// 파일의 경로, 크기 등 정보를 확인하거나 파일을 생성 할 수 있음

		// newfile.txt와 연결된 파일 클래스 생성
		File file = new File("C:\\BaeJooHwan\\newfile.txt");

		// 실제 파일 생성
		file.createNewFile();

		// 파일 속성 보기
		System.out.println("1 " + file.isFile()); // 파일인지?
		System.out.println("2 " + file.isDirectory()); // 폴더인지?
		System.out.println("3 " + file.getName()); // 파일이름
		System.out.println("4 " + file.getAbsolutePath()); // 파일경로
		System.out.println("5 " + file.getPath()); // 파일경로
		System.out.println("6 " + file.canRead()); // 읽을 수 있는지?
		System.out.println("7 " + file.canWrite()); // 쓸 수 있는지?
		System.out.println();
		
		// 파일 삭제(물리적)
		file.delete();
		
		// 디렉토리
		File dir = new File("C:\\BaeJooHwan");
		
		System.out.println(dir.isDirectory());
		System.out.println();
		
		// 폴더 밑에 있는 파일 목록
		File[] files = dir.listFiles();
		
		for(File f : files) {
			System.out.println(f.toString());
		}
	}

}
