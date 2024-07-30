package main;

public class Ex01 {

	public static void main(String[] args) {

		// out: 표준 출력 클래스
		System.out.println("안녕하세요.");
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요.");

		// in: 표준 입력 스트림(대상:키보드)
		try {
			int i = System.in.read();
			System.out.println(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
