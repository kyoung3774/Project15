package main;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		// Scanner는 입력 스트림이 아닌 도구
		// 생성자에 표준입력 스트림을 인자로 넣기
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름");
		String name = scanner.nextLine();
		System.out.println("나이");
		int age = scanner.nextInt();
		
		System.out.println(name);
		System.out.println(age);
	}

}
