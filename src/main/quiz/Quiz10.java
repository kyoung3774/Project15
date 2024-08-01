package main.quiz;

public class Quiz10 {

	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		System.out.println(factorial.factorial(3));
	}

}

class Factorial {
	// 재귀함수로 factorial 구하기	
	public static int factorial(int num) {
		if (num == 1) {
			return 1;
		} else {
			System.out.println("factorial(" + num + ")"); // 몇번 호출했는지 확인해보죠
		return num * factorial(num - 1);
		}	
	}
}