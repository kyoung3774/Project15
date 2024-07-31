package main.quiz;

import java.io.FileWriter;
import java.io.IOException;

public class Quiz05 {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("Quiz05.txt");

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				fw.write(i + " ");
			}
		}
		fw.flush();
	}

}
