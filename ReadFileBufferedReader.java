package demoproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*Reading File Using Buffered Reader*/

public class ReadFileBufferedReader {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\pc\\Desktop\\CollabQuestions.txt");
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		String fileContent;
		long start = System.currentTimeMillis();
		while ((fileContent = bufferedReader.readLine()) != null) {
			System.out.println(fileContent);
		}
		long end = System.currentTimeMillis();

		System.out.println(end - start);
	}

}
