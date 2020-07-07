package demoproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFileScanner {
	
	public static void main(String[] args) throws IOException {
		
		
		File file=new File("C:\\Users\\pc\\Desktop\\CollabQuestions.txt");
		long start=System.currentTimeMillis();
		Scanner scanner=new Scanner(file);
		while(scanner.hasNextLine()) {
			
			System.out.println(scanner.nextLine());
			
		}
		long end=System.currentTimeMillis();
		System.out.println(end-start);
	}
	

}
