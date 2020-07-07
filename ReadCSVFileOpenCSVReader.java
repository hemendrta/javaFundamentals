package demoproject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class ReadCSVFileOpenCSVReader {

	public static void main(String[] args) throws IOException {

		long start = System.currentTimeMillis();
		CSVReader csvReader = new CSVReader(new FileReader("C:\\Users\\pc\\Desktop\\democsv.csv"));
		String[] data;

		while ((data = csvReader.readNext()) != null) {

			for (String string : data) {
				System.out.print(string + " ");
				System.out.println();
			}
			long end = System.currentTimeMillis();
			System.out.println();
			System.out.println(end - start);
		}

	}

}
