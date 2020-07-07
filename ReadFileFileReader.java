package demoproject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*Reading File using FileReader*/

public class ReadFileFileReader {

	public static void main(String[] args) throws IOException {

		FileReader fileReader = new FileReader("C:\\Users\\pc\\Desktop\\CollabQuestions.txt");

		int i;
		long start = System.currentTimeMillis();
		while ((i = fileReader.read()) != -1) {

			System.out.println((char) i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);

	}

}
