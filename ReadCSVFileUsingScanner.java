package demoproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadCSVFileUsingScanner {

	public static void main(String[] args) throws IOException {

		long start = System.currentTimeMillis();
		Scanner scanner = new Scanner(new File("C:\\Users\\pc\\Desktop\\democsv.csv"));
		scanner.useDelimiter(",");
		while (scanner.hasNext()) {
			System.out.print(scanner.next() + " \t ");

		}
		scanner.close();
		long end = System.currentTimeMillis();
		System.out.println();
		System.out.println(end - start);
	}

}
