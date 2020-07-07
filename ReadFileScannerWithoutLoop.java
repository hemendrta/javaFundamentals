package demoproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileScannerWithoutLoop {
	
	public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\Users\\pc\\Desktop\\CollabQuestions.txt");
		long start=System.currentTimeMillis();
		Scanner scanner=new Scanner(file);
		
		scanner.useDelimiter("\\Z");
		System.out.println(scanner.next());
		long end=System.currentTimeMillis();
		System.out.println(end-start);
		
	}

}
