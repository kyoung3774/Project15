package main.quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("문자열을 입력하세요.");
			String str = scanner.nextLine();
			if(str.equalsIgnoreCase("STOP")) { // equalsIgnoreCase: 대소문자 구분 안함
				System.out.println("종료");
				break;
		
			}
			
		}
	}

}
