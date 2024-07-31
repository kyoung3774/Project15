package main.quiz;

import java.io.File;

public class Quiz09 {

	public static void main(String[] args) {

		subStream();
	}
	static void subStream() {
		File dir = new File("C:\\Users\\G201\\Downloads");

		File[] files = dir.listFiles();

		for (File f : files) {
			System.out.println(f.toString());
		}
	}
}
