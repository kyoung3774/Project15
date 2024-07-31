package main.quiz;

import java.io.File;

public class Quiz08 {

	public static void main(String[] args) {

		File dir = new File("C:\\Users\\G201\\Downloads");

		File[] files = dir.listFiles();

		for (File f : files) {
			System.out.println(f.toString());
		}
	}

}
