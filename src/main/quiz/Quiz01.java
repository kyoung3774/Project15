package main.quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
			sum += arr[i];
		}
		System.out.println("배열: " + Arrays.toString(arr)); // Arrays.toString: 주소값을 배열 value를 String 변환 / Arrays: 배열의 static 메소드 
		System.out.println("숫자 " + arr.length + "개의 합은 " + sum + "입니다.");
	}

}
