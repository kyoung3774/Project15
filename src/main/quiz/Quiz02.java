package main.quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 입력");
		int num = scanner.nextInt();
		int units = num % 10;
		int tens = num / 10;

		System.out.println("일의자리와 십의자리의 합은 " + (units + tens) + "입니다.");
	}

}
