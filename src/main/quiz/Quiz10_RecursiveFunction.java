package main.quiz;

public class Quiz10_RecursiveFunction {

	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		System.out.println(factorial.factorial(3));
	}

}

class Factorial {
	public static int factorial(int num) {
		if (num == 1) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}
	}
}