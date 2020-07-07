package demoproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVFileBufferedReader {

	public static void main(String[] args) throws IOException {

		String line = "";
		String splitBy = ",";

		long start = System.currentTimeMillis();

		BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\pc\\Desktop\\democsv.csv"));

		while ((line = bufferedReader.readLine()) != null) {

			String[] data = line.split(splitBy);
			System.out.println();
			System.out.print(line);
			System.out.println();
		}

		long end = System.currentTimeMillis();
		System.out.println();
		System.out.println(end - start);

	}

}
